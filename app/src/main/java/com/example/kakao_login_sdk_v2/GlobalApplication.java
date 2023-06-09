package com.example.kakao_login_sdk_v2;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class GlobalApplication extends Application {
    private static GlobalApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // 네이티브 앱 키로 초기화
        KakaoSdk.init(this, "2fab4a5c75faa9ca01dfb315dce9b869");
    }
}
