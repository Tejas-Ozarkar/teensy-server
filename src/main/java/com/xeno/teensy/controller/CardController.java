package com.xeno.teensy.controller;

import com.xeno.teensy.service.CardService;
import io.tej.SwaggerCodgen.api.CardApi;
import io.tej.SwaggerCodgen.model.*;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class CardController implements CardApi {

    @Autowired
    CardService cardService;

    @Override
    public ResponseEntity<CardResponse> createCard(CardRequest cardRequest) {
        return ResponseEntity.ok(cardService.createCard(cardRequest));
    }

    @Override
    public ResponseEntity<List<CardResponse>> getUserCards() {
        return ResponseEntity.ok(cardService.getUserCards());
    }

    @Override
    public ResponseEntity<GenericResponse> deleteCard(Integer cardId) {
        cardService.deleteCard(cardId);
        return ResponseEntity.ok(new GenericResponse().message("Deleted Successfully"));
    }

    @Override
    public ResponseEntity<List<CardResponse>> getGroupCards(Integer groupId) {
        return ResponseEntity.ok(cardService.getGroupCards(groupId));
    }

    @Override
    public ResponseEntity<CardResponse> getCardInfo(Integer cardId) {
        return ResponseEntity.ok(cardService.getCard(cardId));
    }

    @Override
    public ResponseEntity<CardResponse> editCard(Integer cardId, UpdateCardDto updateCardDto) {
        return ResponseEntity.ok(cardService.editCard(cardId, updateCardDto));
    }
}
