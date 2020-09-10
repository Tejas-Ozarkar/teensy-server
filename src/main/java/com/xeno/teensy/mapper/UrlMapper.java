package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.UrlDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UrlMapper {

    UrlDto toDto(Url url);
    Url toEntity(UrlDto dto);
    List<UrlDto> toDto(List<Url> urls);
}
