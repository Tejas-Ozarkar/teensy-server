package com.xeno.teensy.controller;

import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import com.xeno.teensy.jwt.JwtUtil;
import com.xeno.teensy.mapper.UrlMapper;
import com.xeno.teensy.mapper.UserMapper;
import com.xeno.teensy.service.MyUserDetailsService;
import io.tej.SwaggerCodgen.api.AuthApi;
import io.tej.SwaggerCodgen.model.AuthRequest;
import io.tej.SwaggerCodgen.model.AuthResponse;
import io.tej.SwaggerCodgen.model.ModelApiResponse;
import io.tej.SwaggerCodgen.model.UserDto;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController implements AuthApi {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    MyUserDetailsService userDetailsService;

    @Autowired
    JwtUtil jwtUtil;


    private final UserMapper userMapper = Mappers.getMapper(UserMapper.class);


    @Override
    public ResponseEntity<ModelApiResponse> signup(UserDto userDto) {
        userDetailsService.signupUser(userMapper.toEntity(userDto));
        return ResponseEntity.ok(new ModelApiResponse().message("User Created"));
    }

    @Override
    public ResponseEntity<AuthResponse> signin(AuthRequest authRequest) {

        authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authRequest.getUsername());

        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthResponse().jwt(jwt));
    }
}
