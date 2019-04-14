package com.example.travelercompanion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;

public class MoneyButton extends AppCompatActivity {
    private WebView mMoneyWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_button);
        mMoneyWebView=(WebView)findViewById(R.id.MoneyWebView);
       // File htmlFile = new File("file:///app/src/main/android_assets/payment.html");
       // if (htmlFile.exists()){
            mMoneyWebView.loadUrl("https://www.paypal.com/welcome/signup/#/email_one_password");
}}
