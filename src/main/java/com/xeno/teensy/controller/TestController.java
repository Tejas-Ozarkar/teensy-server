package com.xeno.teensy.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController

public class TestController {

    @Operation(security = { @SecurityRequirement(name = "bearer-key") })
    @GetMapping
    public String hello(){
        return "Testing";
    }


}
