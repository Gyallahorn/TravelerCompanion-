package com.example.travelercompanion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class Home extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener , View.OnClickListener {
    private  ConstraintLayout mHome ;int i=0;    Button mBoneyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Switch perekl = (Switch) findViewById(R.id.switch1);
        if (perekl!=null) {
            perekl.setOnCheckedChangeListener(this);

        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Toast.makeText(this,(isChecked? "режим Гида":"" +
                "Теперь вы Путешественник"),Toast.LENGTH_SHORT).show();
        mBoneyButton= (Button)findViewById(R.id.moneyButton);
        mBoneyButton.setOnClickListener(this);
        if (isChecked) {
            mBoneyButton.setVisibility(View.VISIBLE);
        } else {
            mBoneyButton.setVisibility(View.GONE);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.moneyButton:
            Intent intent = new Intent(this,MoneyButton.class);
            startActivity(intent);
        }

    }
}