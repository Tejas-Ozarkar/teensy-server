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
                .insertInto(Tables.URL, Tables.URL.LONGURL, Tables.URL.SHORTURL)
                .values(url.getLongurl(), shortUrl)
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
        return context
                .selectFrom(Tables.URL)
                .where(Tables.URL.SHORTURL.eq(shortUrl))
                .fetchOneInto(Url.class);
    }

    public Url editUrl(Url url) {
        return context.update(Tables.URL)
                .set(Tables.URL.LONGURL, url.getLongurl())
                .returning()
                .fetchOne()
                .into(Url.class);
    }
}