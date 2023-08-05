package com.example.changetheme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    TextView ThemeTXT;
    Boolean themeStatus;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        ThemeTXT = findViewById(R.id.ThemeTXT);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                setTitle("Dark Mode");

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                ThemeTXT.setText("Dark Mode");


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setTitle("Light Mode");

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                ThemeTXT.setText("Light Mode");
            }

        });





    }
}