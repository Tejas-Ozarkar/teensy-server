package com.xeno.teensy.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;

@RestController
public class RedirectionController {

    @GetMapping("/")
    public RedirectView handleFoo() {
        return new RedirectView("http://www.google.com");
    }
}
