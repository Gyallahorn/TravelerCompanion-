package com.example.travelercompanion;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import java.io.File;

public class WebMap extends AppCompatActivity{
    WebView mWebView;
    @Override
 protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
setContentView(R.layout.web_map_fragment);
File f = new File("src/main/android_assets/meinUrl.html") ;
mWebView = (WebView)findViewById(R.id.webView);
mWebView.loadUrl("https://www.google.com/maps/@54.7950637,63.9841166,4z?hl=ru-RU");
mWebView.getSettings().setJavaScriptEnabled(true);

 }
}

