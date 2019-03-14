package com.example.acer.servicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//TODO 1:start service
    public void startService(View view) {
        Intent intent=new Intent(this,MusicPlayerService.class);
        startService(intent);
    }
    //TODO 2:stop service

    public void stopService(View view) {
        Intent intent=new Intent(this,MusicPlayerService.class);
        stopService(intent);

    }
}
