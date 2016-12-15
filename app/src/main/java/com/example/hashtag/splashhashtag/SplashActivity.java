package com.example.hashtag.splashhashtag;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;


public class SplashActivity extends AppCompatActivity {

    //Constante de tempo
    private static int TIME_SPLASH = 7000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dashboard = new Intent(SplashActivity.this, LoginHashTag.class);
                startActivity(dashboard);
                finish();
            }
        }, TIME_SPLASH);


    }
}
