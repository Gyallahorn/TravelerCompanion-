package com.example.travelercompanion;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {


    private  final  int SPLASH_DISPLAY_LEGHT= 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int d=0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run (){
                if (d==0){
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();}
                else {
                    Intent mainIntent = new Intent(SplashActivity.this,LoginActivity.class);
                    SplashActivity.this.startActivity(mainIntent);
                    SplashActivity.this.finish();}

                }

        },SPLASH_DISPLAY_LEGHT);

    }
    @Override
    public void onBackPressed(){
    super.onBackPressed();}
}
