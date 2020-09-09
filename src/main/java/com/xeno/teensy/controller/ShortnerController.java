package com.xeno.teensy.controller;


import java.util.List;

import com.xeno.teensy.entity.Url;
import com.xeno.teensy.service.ShortnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
public class ShortnerController {
    
    @Autowired
    ShortnerService service;
    @GetMapping
    public List<Url> getUrls(){
        return service.getUrls();
    }

    @PostMapping
    public String postUrl(@RequestBody Url url){
        service.saveUrl(url);
        return "Url Added";
    }
}