package com.xeno.teensy.service;

import com.google.common.hash.Hashing;
import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.jooq.impl.DSL.row;


@Service
public class ShortenerService {

    @Autowired
    DSLContext context;

    @Autowired
    MyUserDetailsService userDetailsService;


    public Url saveUrl(Url url) {
        String shortUrl = Hashing.murmur3_32().hashString(url.getLongurl() + System.currentTimeMillis(), StandardCharsets.UTF_8).toString();
//        User user = userDetailsService.getCurrentUserDetails();
        return context
                .insertInto(Tables.URL, Tables.URL.LONGURL, Tables.URL.SHORTURL, Tables.URL.EXPIRYDATE)
                .values(url.getLongurl(), shortUrl, url.getExpirydate())
                .returning()
                .fetchOne()
                .into(Url.class);
    }

    public List<Url> getUrls() {
        User user = userDetailsService.getCurrentUserDetails();
        return context
                .selectFrom(Tables.URL)
                .where(Tables.URL.USERID.eq(user.getId()))
                .fetchInto(Url.class);
    }

    public Url getLongUrl(String shortUrl) {

        Url url = context
                .selectFrom(Tables.URL)
                .where(Tables.URL.SHORTURL.eq(shortUrl))
                .fetchOneInto(Url.class);
        if (url != null) {

            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
            Date expiryDate = new Date();
            Date currentDate = new Date();
            try {
                expiryDate = formatter.parse(url.getExpirydate());
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
            System.out.println(expiryDate);
            System.out.println(currentDate);
            if (currentDate.after(expiryDate)) {
                context.delete(Tables.URL).where(Tables.URL.ID.eq(url.getId())).execute();
                System.out.println("expired");
                return null;
            }
            return url;
        }
        return url;
    }

    public Url editUrl(Url url) {
        return context.update(Tables.URL)
                .set(Tables.URL.LONGURL, url.getLongurl())
                .returning()
                .fetchOne()
                .into(Url.class);
    }
}