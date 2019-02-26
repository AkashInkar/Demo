package com.example.jack.pramodshinde.marathiActivit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jack.pramodshinde.R;

import javax.security.auth.Destroyable;

public class MarathiContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathi_contact);
    }
    @Override
    public void onBackPressed() {
        finish();
    }

}
