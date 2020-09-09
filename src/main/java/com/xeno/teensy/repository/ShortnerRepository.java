package com.xeno.teensy.repository;

import com.xeno.teensy.entity.Url;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortnerRepository extends JpaRepository<Url, Long>{
    
}