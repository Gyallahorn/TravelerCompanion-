package com.example.travelercompanion;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.SearchView;

public class Search extends AppCompatActivity {
    private SearchView mSearch;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        mSearch = (SearchView) findViewById(R.id.search_brr);


    }}
