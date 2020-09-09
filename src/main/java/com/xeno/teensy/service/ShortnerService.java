package com.xeno.teensy.service;

import java.util.List;

import com.xeno.teensy.entity.Url;
import com.xeno.teensy.repository.ShortnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShortnerService {

    @Autowired
    ShortnerRepository shortnerRepository;

    public void saveUrl(Url url){
        shortnerRepository.save(url);
    }

    public List<Url> getUrls(){
        return shortnerRepository.findAll();
    }
}