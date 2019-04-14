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
    //    String url = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        mGidDetail = findViewById(R.id.gidWebView);
        mGidDetail.loadUrl("https://www.sputnik8.com/ru/st-petersburg/private-guides?source=google&medium=cpc&campaign=Dynamic_Search_Ads_SPb|359253650&keyword=&campaign_id=359253650&gbid=23165394410&adid=82222829690&banid=82222829690&kwid=dsa-183666774050&pos=1t3&matchtype=b&srct=g&src=&devt=c&p1=zagolovok&p2=&agency&gclid=CjwKCAjwkcblBRB_EiwAFmfyyyytjk4JGXiK37VG0XRUS-7sBvFG3DMSoguMiPekKg6miRBOZB0pmhoCSX8QAvD_BwE");
        mGidDetail.getSettings().setJavaScriptEnabled(true);
    }
}
