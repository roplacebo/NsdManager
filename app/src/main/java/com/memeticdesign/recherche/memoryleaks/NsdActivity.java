package com.memeticdesign.recherche.memoryleaks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.os.Bundle;

public class NsdActivity extends AppCompatActivity {

    public NsdManager nsdManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsd);
        nsdManager = (NsdManager)getSystemService(Context.NSD_SERVICE);
//        nsdManager = (NsdManager)getApplicationContext().getSystemService(Context.NSD_SERVICE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        nsdManager = null;
    }
}