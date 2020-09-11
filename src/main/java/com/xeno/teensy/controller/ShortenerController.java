package com.xeno.teensy.controller;

import com.xeno.teensy.mapper.UrlRequestMapper;
import com.xeno.teensy.mapper.UrlResponseMapper;
import com.xeno.teensy.service.ShortenerService;

import io.tej.SwaggerCodgen.api.UrlApi;
import io.tej.SwaggerCodgen.model.UrlRequestDto;
import io.tej.SwaggerCodgen.model.UrlResponseDto;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShortenerController implements UrlApi {

    @Autowired
    ShortenerService service;

    private final UrlRequestMapper urlRequestMapper = Mappers.getMapper(UrlRequestMapper.class);
    private final UrlResponseMapper urlResponseMapper = Mappers.getMapper(UrlResponseMapper.class);

    @Override
    public ResponseEntity<UrlResponseDto> getLongUrl(String shortUrl) {
        return ResponseEntity.ok(urlResponseMapper.toResponseDto(service.getLongUrl(shortUrl)));
    }

    @Override
    public ResponseEntity<UrlResponseDto> createTinyUrl(UrlRequestDto urlDto) {
        return ResponseEntity.ok(urlResponseMapper.toResponseDto( service.saveUrl(urlRequestMapper.toRequestEntity(urlDto))));
    }

    @Override
    public ResponseEntity<List<UrlResponseDto>> getUrls() {
        return ResponseEntity.ok(urlResponseMapper.toResponseDto(
                service.getUrls()
        ));
    }
}