package com.example.srijan.timerdemo;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){

            public void onTick(long secondsLeft){
                Log.i("Seconds left",Long.toString(secondsLeft/1000));
            }
            public void onFinish(){
                Log.i("We are done","No count left");
            }
        }.start();
    }
}
