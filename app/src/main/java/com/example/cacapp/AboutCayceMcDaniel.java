package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AboutCayceMcDaniel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_cayce_mc_daniel);
    }

    public void onClickReturnMissingPersonScn_cayce_mcdaniel(View view)
    {
        finish();
    }
}