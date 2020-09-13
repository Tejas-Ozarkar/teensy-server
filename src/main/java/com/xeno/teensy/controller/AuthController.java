package com.xeno.teensy.controller;

import com.xeno.teensy.jwt.JwtUtil;
import com.xeno.teensy.mapper.UserMapper;
import com.xeno.teensy.service.MyUserDetailsService;
import io.tej.SwaggerCodgen.api.AuthApi;
import io.tej.SwaggerCodgen.model.*;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
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
    public ResponseEntity<GenericResponse> signup(UserDto userDto) {
        userDetailsService.signupUser(userMapper.toEntity(userDto));
        return ResponseEntity.ok(new GenericResponse().message("User Created"));
    }

    @Override
    public ResponseEntity<AuthResponse> signin(AuthRequest authRequest) {

        authenticationManager.authenticate(
                      new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        AuthResponse authResponse = userMapper.toAuthResponse(userDetailsService.findUserByUsername(authRequest.getUsername()));
        return ResponseEntity.ok(authResponse.jwt(jwt));
    }
}
