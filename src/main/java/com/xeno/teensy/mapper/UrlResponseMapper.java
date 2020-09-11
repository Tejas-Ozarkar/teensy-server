package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.UrlRequestDto;
import io.tej.SwaggerCodgen.model.UrlResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UrlResponseMapper {

    UrlResponseDto toResponseDto(Url url);
    Url toResponseEntity(UrlResponseDto dto);
    List<UrlResponseDto> toResponseDto(List<Url> urls);
}
