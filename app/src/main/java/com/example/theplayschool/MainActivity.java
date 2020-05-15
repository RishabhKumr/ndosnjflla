package com.example.theplayschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
     private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Welcome Aboard!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent LoginIntent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(LoginIntent);
                finish();;
            }
        },SPLASH_TIME_OUT);
    }
}
