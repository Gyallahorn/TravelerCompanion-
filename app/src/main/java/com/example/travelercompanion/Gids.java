package com.example.travelercompanion;


import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Gids<NewThread> extends Activity  {

;

    public Elements contents;
    public ArrayList<String> titleList = new ArrayList<String>();
    List<GidModel> gidsList = new ArrayList<>();
    CustomAdapter adapter;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gids);
        final RecyclerView listView = findViewById(R.id.gids_list);
        progressBar = findViewById(R.id.gids_list_loader);
        final ArrayList<String> Gids_names = new ArrayList<>();
        final ArrayList<String> Gids_about = new ArrayList<>();

        // List<GidModel> gidsList = new ArrayList<>();
//        gidsList.add(new GidModel("asd", "John", "Bla bla", "Bio", "qwe"));
//        gidsList.add(new GidModel("asd", "John", "Bla bla", "Bio", "qwe"));
//        gidsList.add(new GidModel("asd", "John", "Bla bla", "Bio", "qwe"));
//        gidsList.add(new GidModel("asd", "John", "Bla bla", "Bio", "qwe"));
//        gidsList.add(new GidModel("asd", "John", "Bla bla", "Bio", "qwe"));


        new Thread(new Runnable() {
            Element element1;

            @Override
            public void run() {
                Document doc = null;
                try {
                    int i = 0;
                    doc = Jsoup.connect("https://www.sputnik8.com/ru/st-petersburg/private-guides?source=google&medium=cpc&campaign=Dynamic_Search_Ads_SPb|359253650&keyword=&campaign_id=359253650&gbid=23165394410&adid=82222829690&banid=82222829690&kwid=dsa-183666774050&pos=1t3&matchtype=b&srct=g&src=&devt=c&p1=zagolovok&p2=&agency&gclid=CjwKCAjwkcblBRB_EiwAFmfyyyytjk4JGXiK37VG0XRUS-7sBvFG3DMSoguMiPekKg6miRBOZB0pmhoCSX8QAvD_BwE").get();
                    contents = doc.select("div.col-12.col-md-6.col-lg-4");
                    for (Element element : contents) {
                        String name = element.select("a.activity-guide__text.activity-guide__text_name.activity-guide__text_name-fullwidth").text();
                        String bio = element.select("div.activity-guide__text.activity-guide__text_tiny").text();
                        String about = element.select("div.activity-guide__text.activity-guide__text_message.block_mob-hidden").text();
                        final String href = element.select("a").first().absUrl("href");
                        GidModel gidModel = new GidModel(String.valueOf(i), name, about, bio, href);
                        gidsList.add(gidModel);
                        if (gidsList.size() == 11) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setVisibility(View.GONE);
                                    adapter = new CustomAdapter(getApplicationContext(), gidsList, new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getApplicationContext(), gid_details.class);
                                            intent.putExtra(Intent.EXTRA_TEXT, href);
                                            startActivity(intent);
                                        }
                                    });
                                    listView.setAdapter(adapter);
                                }
                            });
//                            adapter.notifyDataSetChanged();
                        }

//                        Gids_names.add(String.valueOf(gid));
                    }
                    //titleList.clear();

                } catch (IOException e) {
                    e.printStackTrace();
                }
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        String text;
//                        Elements Name;
//                        for (Element content : contents) {
//                            int i = 0;
//
//
//                            //titleList.add(contents.text());
//
//
//                            Log.d("TEST", contents.text());
//                            adapter.notifyDataSetChanged();
//                            ;
//                        }
//
//                    }
//                });
            }

        }).start();

    }




}
