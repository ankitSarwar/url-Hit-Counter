package com.example.URL.Hit.Counter.service;

import com.example.URL.Hit.Counter.repositry.UrlHitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

    @Autowired
    UrlHitDao urlHitDao;

    public int getCount() {
        return urlHitDao.urlCount();
    }
}
