package com.memeticdesign.recherche.memoryleaks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNsdActivity(View v){
        Intent intent = new Intent();
        intent.setClass(this,NsdActivity.class);
        startActivity(intent);
    }
}