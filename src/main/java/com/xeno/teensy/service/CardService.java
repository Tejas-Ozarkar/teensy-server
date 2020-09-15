package com.xeno.teensy.service;

import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Card;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.CardRequest;
import io.tej.SwaggerCodgen.model.CardResponse;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.jooq.impl.DSL.row;

@Service
public class CardService {

    @Autowired
    DSLContext context;

    @Autowired
    ShortenerService shortenerService;

    public CardResponse createCard(CardRequest cardRequest) {
        Url url = new Url();
        url.setLongurl(cardRequest.getLongurl());
        Url newUrl = shortenerService.saveUrl(url);
        CardResponse cardResponse = context
                .insertInto(Tables.CARD, Tables.CARD.TITLE, Tables.CARD.DESCRIPTION, Tables.CARD.ICON, Tables.CARD.URLID, Tables.CARD.GROUPID)
                .values(cardRequest.getTitle(), cardRequest.getDescription(), cardRequest.getIcon(), newUrl.getId(),  cardRequest.getGroupid())
                .returning()
                .fetchOne()
                .into(CardResponse.class);
        cardResponse.setShorturl(newUrl.getShorturl());
        cardResponse.setLongurl(newUrl.getLongurl());
        return cardResponse;
    }

    public List<CardResponse> getUserCards() {
        return context.select(
                Tables.CARD.asterisk(), Tables.URL.SHORTURL, Tables.URL.LONGURL,
                Tables.TRIBE.TITLE.as("grouptitle"),
                Tables.TRIBE.DESCRIPTION.as("groupdescription"))
                .from(Tables.CARD)
                .join(Tables.URL).on(Tables.CARD.URLID.eq(Tables.URL.ID))
                .leftJoin(Tables.TRIBE).on(Tables.CARD.GROUPID.eq(Tables.TRIBE.ID))
                .fetchInto(CardResponse.class);
    }

    public List<CardResponse> getGroupCards(int groupId){
        return context.select(Tables.CARD.asterisk(), Tables.URL.SHORTURL, Tables.URL.LONGURL)
                .from(Tables.CARD, Tables.URL)
                .where(Tables.CARD.URLID.eq(Tables.URL.ID))
                .and(Tables.CARD.GROUPID.eq(groupId))
                .fetchInto(CardResponse.class);
    }

    public void deleteCard(int id) {
        int urlId= context.select(Tables.CARD.URLID).from(Tables.CARD).where(Tables.CARD.ID.eq(id)).fetchOne().into(Integer.class);
        context.delete(Tables.CARD)
                .where(Tables.CARD.ID.eq(id))
                .execute();
        context.delete(Tables.URL)
                .where(Tables.URL.ID.eq(urlId))
                .execute();
    }

    public CardResponse editCard(Card card, Url url){
        CardResponse cardResponse = context.update(Tables.CARD)
                .set(row(Tables.CARD.TITLE,Tables.CARD.DESCRIPTION, Tables.CARD.ICON),
                        row(card.getTitle(), card.getDescription(), card.getIcon()))
                .where(Tables.CARD.ID.eq(card.getId()))
                .returning()
                .fetchOne()
                .into(CardResponse.class);
        url.setId(card.getUrlid());
        Url updatedUrl = shortenerService.editUrl(url);
        cardResponse.setShorturl(updatedUrl.getShorturl());
        cardResponse.setLongurl(updatedUrl.getLongurl());
        return cardResponse;
    }

}
