package com.example.jack.pramodshinde.marathiActivit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jack.pramodshinde.R;

public class MarathiComplaintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi_complaint);
    }
    @Override
    public void onBackPressed() {
        finish();
    }

}
