package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.UrlRequestDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-14T18:12:24+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
public class UrlRequestMapperImpl implements UrlRequestMapper {

    @Override
    public UrlRequestDto toRequestDto(Url url) {
        if ( url == null ) {
            return null;
        }

        UrlRequestDto urlRequestDto = new UrlRequestDto();

        urlRequestDto.setLongurl( url.getLongurl() );

        return urlRequestDto;
    }

    @Override
    public Url toRequestEntity(UrlRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Url url = new Url();

        url.setLongurl( dto.getLongurl() );

        return url;
    }

    @Override
    public List<UrlRequestDto> toRequestDto(List<Url> urls) {
        if ( urls == null ) {
            return null;
        }

        List<UrlRequestDto> list = new ArrayList<UrlRequestDto>( urls.size() );
        for ( Url url : urls ) {
            list.add( toRequestDto( url ) );
        }

        return list;
    }
}
