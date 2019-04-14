package com.example.travelercompanion;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class gid_details extends Activity {
    private WebView mGidDetail;

    @SuppressLint("SetJavaScriptEnabled")
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        setContentView(R.layout.gid_detail);
        String url = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        mGidDetail = findViewById(R.id.gidWebView);
        mGidDetail.loadUrl(url);
        mGidDetail.getSettings().setJavaScriptEnabled(true);
    }
}
