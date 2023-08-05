package com.example.boardcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter("com.sofiyan.Boardmessage");
        MyBoardCastReceiver myBoardCastReceiver = new MyBoardCastReceiver();
        registerReceiver(myBoardCastReceiver,intentFilter);


        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.BATTERY_LOW");
        MyBoardCastReceiver myBoardCastReceiver2 = new MyBoardCastReceiver();
        registerReceiver(myBoardCastReceiver2,intentFilter2);

    }
}