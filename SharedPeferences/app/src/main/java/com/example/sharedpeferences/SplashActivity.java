package com.example.sharedpeferences;

import androidx.appcompat.app.AppCompatActivity;

import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences pref = getSharedPreferences("Login",MODE_PRIVATE);
                Boolean check = pref.getBoolean("flag", false);

                Intent iNext;
                if (check){
                    iNext = new Intent(getApplicationContext(),MainActivity.class);
                }
                else{
                    iNext = new Intent(getApplicationContext(),LoginActivity.class);
                }
                startActivity(iNext);

            }
        },4000);
    }
}