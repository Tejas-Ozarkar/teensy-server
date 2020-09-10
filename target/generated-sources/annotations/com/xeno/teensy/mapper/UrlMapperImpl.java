package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import io.tej.SwaggerCodgen.model.UrlDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-11T00:49:23+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
public class UrlMapperImpl implements UrlMapper {

    @Override
    public UrlDto toDto(Url url) {
        if ( url == null ) {
            return null;
        }

        UrlDto urlDto = new UrlDto();

        urlDto.setShorturl( url.getShorturl() );
        urlDto.setLongurl( url.getLongurl() );

        return urlDto;
    }

    @Override
    public Url toEntity(UrlDto dto) {
        if ( dto == null ) {
            return null;
        }

        Url url = new Url();

        url.setShorturl( dto.getShorturl() );
        url.setLongurl( dto.getLongurl() );

        return url;
    }

    @Override
    public List<UrlDto> toDto(List<Url> urls) {
        if ( urls == null ) {
            return null;
        }

        List<UrlDto> list = new ArrayList<UrlDto>( urls.size() );
        for ( Url url : urls ) {
            list.add( toDto( url ) );
        }

        return list;
    }
}
