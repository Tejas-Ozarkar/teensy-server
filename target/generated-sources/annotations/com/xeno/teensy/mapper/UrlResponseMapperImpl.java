package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.UrlResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-11T15:57:13+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
public class UrlResponseMapperImpl implements UrlResponseMapper {

    @Override
    public UrlResponseDto toResponseDto(Url url) {
        if ( url == null ) {
            return null;
        }

        UrlResponseDto urlResponseDto = new UrlResponseDto();

        urlResponseDto.setShorturl( url.getShorturl() );
        urlResponseDto.setLongurl( url.getLongurl() );

        return urlResponseDto;
    }

    @Override
    public Url toResponseEntity(UrlResponseDto dto) {
        if ( dto == null ) {
            return null;
        }

        Url url = new Url();

        url.setShorturl( dto.getShorturl() );
        url.setLongurl( dto.getLongurl() );

        return url;
    }

    @Override
    public List<UrlResponseDto> toResponseDto(List<Url> urls) {
        if ( urls == null ) {
            return null;
        }

        List<UrlResponseDto> list = new ArrayList<UrlResponseDto>( urls.size() );
        for ( Url url : urls ) {
            list.add( toResponseDto( url ) );
        }

        return list;
    }
}
