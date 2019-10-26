package com.example.tasmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ViewFlipper;

public class Admin extends AppCompatActivity {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        viewFlipper =(ViewFlipper)findViewById(R.id.viewFlipper);
    }
}
