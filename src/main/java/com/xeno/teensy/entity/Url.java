package com.xeno.teensy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Url {
    
    @Id
    @GeneratedValue
    public long id;

    public String shortUrl;
    public String longUrl;
}