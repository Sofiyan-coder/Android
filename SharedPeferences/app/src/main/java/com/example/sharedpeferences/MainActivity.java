package com.example.sharedpeferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.logoutbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences pref = getSharedPreferences("Login",MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                editor.putBoolean("flag",false);
                editor.apply();

                Toast.makeText(MainActivity.this, "Logout Successfull", Toast.LENGTH_SHORT).show();

            }
        });
    }
}