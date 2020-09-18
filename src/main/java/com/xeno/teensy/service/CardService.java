package com.xeno.teensy.service;

import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Card;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.CardRequest;
import io.tej.SwaggerCodgen.model.CardResponse;
import io.tej.SwaggerCodgen.model.UpdateCardDto;
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
                .values(cardRequest.getTitle(), cardRequest.getDescription(), cardRequest.getIcon(), newUrl.getId(), cardRequest.getGroupid())
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

    public List<CardResponse> getGroupCards(int groupId) {
        return context.select(Tables.CARD.asterisk(), Tables.URL.SHORTURL, Tables.URL.LONGURL)
                .from(Tables.CARD, Tables.URL)
                .where(Tables.CARD.URLID.eq(Tables.URL.ID))
                .and(Tables.CARD.GROUPID.eq(groupId))
                .fetchInto(CardResponse.class);
    }

    public void deleteCard(int id) {
        int urlId = context.select(Tables.CARD.URLID).from(Tables.CARD).where(Tables.CARD.ID.eq(id)).fetchOne().into(Integer.class);
        context.delete(Tables.CARD)
                .where(Tables.CARD.ID.eq(id))
                .execute();
        context.delete(Tables.URL)
                .where(Tables.URL.ID.eq(urlId))
                .execute();
    }

    public CardResponse editCard(int id, UpdateCardDto card) {
        context.update(Tables.CARD)
                .set(row(Tables.CARD.TITLE, Tables.CARD.DESCRIPTION, Tables.CARD.ICON),
                        row(card.getTitle(), card.getDescription(), card.getIcon()))
                .where(Tables.CARD.ID.eq(id))
                .execute();
        CardResponse cardResponse = context.selectFrom(Tables.CARD)
                .where(Tables.CARD.ID.eq(id))
                .fetchOneInto(CardResponse.class);
        Url url = new Url();
        url.setId(cardResponse.getUrlid());
        url.setLongurl(card.getLongurl());
        Url updatedUrl = shortenerService.editUrl(url);
        cardResponse.setShorturl(updatedUrl.getShorturl());
        cardResponse.setLongurl(updatedUrl.getLongurl());
        return cardResponse;
    }

    public CardResponse getCard(int id) {
        return context.select(Tables.CARD.asterisk(), Tables.URL.SHORTURL, Tables.URL.LONGURL)
                .from(Tables.CARD, Tables.URL)
                .where(Tables.CARD.URLID.eq(Tables.URL.ID))
                .and(Tables.CARD.ID.eq(id))
                .fetchOneInto(CardResponse.class);
    }

}
