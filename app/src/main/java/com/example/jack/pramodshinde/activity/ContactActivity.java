package com.example.jack.pramodshinde.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jack.pramodshinde.R;
import com.example.jack.pramodshinde.fragment.Tab1Fragment;
import com.example.jack.pramodshinde.fragment.Tab2Fragment;
import com.example.jack.pramodshinde.model.TabAdapter;

public class ContactActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);








    }
    @Override
    public void onBackPressed() {
        finish();
    }





//    public void changeFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.parent,fragment);
//        fragmentTransaction.commit();
//    }
}
