package com.xeno.teensy.service;

import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Card;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    DSLContext context;

    @Autowired
    ShortenerService shortenerService;

//    public Card createCard(Card card){
//        shortenerService.saveUrl()
//        return context
//                .insertInto(Tables.CARD, )
//    }
}
