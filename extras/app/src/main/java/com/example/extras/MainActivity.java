package com.example.extras;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSendData = findViewById(R.id.btnSend);
            btnSendData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create an Intent to start SecondActivity
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    // Put data as extras in the Intent
                    String message = "Hello from MainActivity!";
                    intent.putExtra("EXTRA_MESSAGE", message);

                    // Start the SecondActivity
                    startActivity(intent);
                }
            });
        }
    }