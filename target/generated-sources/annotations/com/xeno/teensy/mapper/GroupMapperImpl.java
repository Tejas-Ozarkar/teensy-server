package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Tribe;
import io.tej.SwaggerCodgen.model.GroupDto;
import io.tej.SwaggerCodgen.model.GroupResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-14T18:12:24+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
public class GroupMapperImpl implements GroupMapper {

    @Override
    public GroupDto toDto(Tribe group) {
        if ( group == null ) {
            return null;
        }

        GroupDto groupDto = new GroupDto();

        groupDto.setTitle( group.getTitle() );
        groupDto.setDescription( group.getDescription() );

        return groupDto;
    }

    @Override
    public Tribe toEntity(GroupDto groupDto) {
        if ( groupDto == null ) {
            return null;
        }

        Tribe tribe = new Tribe();

        tribe.setTitle( groupDto.getTitle() );
        tribe.setDescription( groupDto.getDescription() );

        return tribe;
    }

    @Override
    public GroupResponse toResponse(Tribe group) {
        if ( group == null ) {
            return null;
        }

        GroupResponse groupResponse = new GroupResponse();

        groupResponse.setTitle( group.getTitle() );
        groupResponse.setDescription( group.getDescription() );
        groupResponse.setId( group.getId() );

        return groupResponse;
    }

    @Override
    public List<GroupResponse> toGroupResponseList(List<Tribe> groups) {
        if ( groups == null ) {
            return null;
        }

        List<GroupResponse> list = new ArrayList<GroupResponse>( groups.size() );
        for ( Tribe tribe : groups ) {
            list.add( toResponse( tribe ) );
        }

        return list;
    }
}
