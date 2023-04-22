package com.example.URL.Hit.Counter.controller;

import com.example.URL.Hit.Counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;

    @GetMapping(value = "/count")
    public int count(){
        return urlHitService.getCount();
    }

}
