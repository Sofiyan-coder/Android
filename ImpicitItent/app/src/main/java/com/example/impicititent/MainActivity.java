package com.example.impicititent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtxt1,edtxt2;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxt1 = findViewById(R.id.editText1);
        edtxt2 = findViewById(R.id.editText2);
        btn1 =  findViewById(R.id.button);
        btn2 =  findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = edtxt1.getText().toString();

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Uri geoUrl = Uri.parse("geo:0,0?q"+edtxt2.getText().toString());
                startActivity(new Intent(Intent.ACTION_VIEW, geoUrl));
            }
        });
    }
}