package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import io.tej.SwaggerCodgen.model.UserDto;
import org.mapstruct.Mapper;

@Mapper
public interface CardMapper {
    UserDto toDto(User user);
    User toEntity(UserDto dto);
}
