package com.example.eyegazeui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Element2 extends AppCompatActivity {
    
    private  static final String TAG = "Element1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: called.");
        setContentView(R.layout.element2);

    }
}
