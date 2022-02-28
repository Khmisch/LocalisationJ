package com.example.localisationj.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.localisationj.MyApplication;
import com.example.localisationj.R;

public class MainActivity extends AppCompatActivity {

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.localeManager.setLocale(this);
        initViews();
    }

    void initViews() {
        context = this;
        Button b_home = findViewById(R.id.bt_home);
        Button bt_preference = findViewById(R.id.bt_preference);
        b_home.setText(getString(R.string.app_name));

        b_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callLanguageActivity();
            }
        });
        bt_preference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callPrefsActivity();
            }
        });
    }

    void callLanguageActivity() {
        Intent intent = new Intent(context, LanguageActivity.class);
        startActivity(intent);
    }

    void callPrefsActivity() {
        Intent intent = new Intent(context, PrefsActivity.class);
        startActivity(intent);
    }
}