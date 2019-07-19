package com.example.di.application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdvertiseServiceTest {

    @Test
    @DisplayName("ツイートテスト")
    void advertise() {
        final AdvertiseService advertiseService = new AdvertiseService();
        advertiseService.advertise(1L, "テストメッセージ");
        // TODO 実際にTweetされたことを確認する必要がある。
    }
}

