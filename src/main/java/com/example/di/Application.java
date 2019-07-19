package com.example.di;

import com.example.di.application.AdvertiseService;

public class Application {
    public static void main(String[] args) {
        final AdvertiseService advertiseService = new AdvertiseService();
        advertiseService.advertise(1L, "販促メッセージ");
    }
}