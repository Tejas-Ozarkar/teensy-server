package com.xeno.teensy.mapper;

import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import io.tej.SwaggerCodgen.model.AuthResponse;
import io.tej.SwaggerCodgen.model.UserDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-18T09:31:01+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setFirstname( user.getFirstname() );
        userDto.setLastname( user.getLastname() );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );
        userDto.setEmail( user.getEmail() );

        return userDto;
    }

    @Override
    public User toEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setFirstname( dto.getFirstname() );
        user.setLastname( dto.getLastname() );
        user.setUsername( dto.getUsername() );
        user.setEmail( dto.getEmail() );
        user.setPassword( dto.getPassword() );

        return user;
    }

    @Override
    public AuthResponse toAuthResponse(User user) {
        if ( user == null ) {
            return null;
        }

        AuthResponse authResponse = new AuthResponse();

        authResponse.setUsername( user.getUsername() );
        authResponse.setEmail( user.getEmail() );
        authResponse.setFirstname( user.getFirstname() );
        authResponse.setLastname( user.getLastname() );

        return authResponse;
    }
}
