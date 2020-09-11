package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.UrlRequestDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UrlRequestMapper {
    UrlRequestDto toRequestDto(Url url);
    Url toRequestEntity(UrlRequestDto dto);
    List<UrlRequestDto> toRequestDto(List<Url> urls);
}
