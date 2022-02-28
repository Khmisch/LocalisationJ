package com.example.localisationj;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import com.example.localisationj.manager.LocaleManager;

public class MyApplication extends Application {
        public static final String TAG = MyApplication.class.getSimpleName();
        public static MyApplication instance;
        public static LocaleManager localeManager;

        @Override
        public void onCreate() {
            super.onCreate();
            instance = this;
            localeManager = new LocaleManager(this);
            localeManager.setLocale(this);

        }

        @Override
        public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            localeManager.setLocale(this);
            Log.d(TAG, "onConfigurationChanged: " + newConfig.locale.getLanguage());
        }


}
