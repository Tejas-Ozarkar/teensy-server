package com.xeno.teensy.service;

import java.util.List;

import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.*;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShortnerService {

    @Autowired
    DSLContext context;


    public void saveUrl(Url url){
        System.out.println("Adding URL"+url) ;
        context.insertInto(Tables.URL,Tables.URL.LONGURL
        ,Tables.URL.SHORTURL)
                .values(url.getLongurl(), url.getShorturl())
        .execute();
    }

    public List<Url> getUrls(){
        return context
                .selectFrom(Tables.URL)
                .fetchInto(Url.class);
    }
}