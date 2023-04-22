package com.example.URL.Hit.Counter.repositry;

import org.springframework.stereotype.Repository;

@Repository
public class UrlHitDao {

    public static int count=0;
    public int urlCount() {
        return count++;
    }
}
