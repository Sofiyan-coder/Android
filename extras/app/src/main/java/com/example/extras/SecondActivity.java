package com.example.extras;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the data from the Intent
        String message = getIntent().getStringExtra("EXTRA_MESSAGE");

        // Display the data in a TextView
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewMessage = findViewById(R.id.textViewMsg);
        textViewMessage.setText(message);
    }
}