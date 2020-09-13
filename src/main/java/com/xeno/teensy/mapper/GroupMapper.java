package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.Tribe;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Url;
import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import io.tej.SwaggerCodgen.model.GroupDto;
import io.tej.SwaggerCodgen.model.GroupResponse;
import io.tej.SwaggerCodgen.model.UrlResponseDto;
import io.tej.SwaggerCodgen.model.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface GroupMapper {
    GroupDto toDto(Tribe group);
    Tribe toEntity(GroupDto groupDto);
    GroupResponse toResponse(Tribe group);
    List<GroupResponse> toGroupResponseList(List<Tribe> groups);
}
