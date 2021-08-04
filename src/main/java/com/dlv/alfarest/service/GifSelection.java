package com.dlv.alfarest.service;

import org.springframework.stereotype.Service;

@Service
public class GifSelection {
    public static String result(Double today, Double yesterday) {
        return (today > yesterday) ? "rich" : "broke";
    }
}