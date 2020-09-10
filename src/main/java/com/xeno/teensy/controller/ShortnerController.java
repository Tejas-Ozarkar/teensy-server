package com.xeno.teensy.controller;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import com.xeno.teensy.mapper.UrlMapper;
import com.xeno.teensy.service.ShortnerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.tej.SwaggerCodgen.api.UrlApi;
import io.tej.SwaggerCodgen.model.ModelApiResponse;
import io.tej.SwaggerCodgen.model.UrlDto;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShortnerController implements UrlApi {

    @Autowired
    ShortnerService service;

    private final UrlMapper urlMapper = Mappers.getMapper(UrlMapper.class);

    @Override
    public ResponseEntity<ModelApiResponse> createTinyUrl(UrlDto urlDto) {
        service.saveUrl(urlMapper.toEntity(urlDto));
        return ResponseEntity.ok(new ModelApiResponse().message("Url Created"));
    }

    @Override
    public ResponseEntity<List<UrlDto>> getUrls() {
        return ResponseEntity.ok(urlMapper.toDto(
                service.getUrls()
        ));

    }
}