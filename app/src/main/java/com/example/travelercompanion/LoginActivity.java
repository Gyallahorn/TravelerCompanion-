package com.example.travelercompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView dsd ;
    EditText mPhoneNumber;
    ImageView img;



    protected void OnCreate (Bundle SavedInstanceBundle){
     super.onCreate(SavedInstanceBundle);
     setContentView(R.layout.login_activity);
    TextView dsd = new TextView(this);
    dsd.findViewById(R.id.textView12);
    img = findViewById(R.id.img);
    mPhoneNumber=findViewById(R.id.editText);
 }


}




