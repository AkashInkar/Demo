package com.example.jack.pramodshinde.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.jack.pramodshinde.ImgActivity.Img2Activity;
import com.example.jack.pramodshinde.ImgActivity.Img3Activity;
import com.example.jack.pramodshinde.ImgActivity.Img4Activity;
import com.example.jack.pramodshinde.ImgActivity.Img5Activity;
import com.example.jack.pramodshinde.R;
import com.example.jack.pramodshinde.model.TabAdapter;

public class WorkActivity extends AppCompatActivity {

    ImageButton facebook,insta,web,twitter,youtube;


    String mono = "7447766109";
    TextView lbltwo,lblthree,lblfour,lblfive,lblsix;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
//        lbltwo = findViewById(R.id.lbltwo);
//        lblthree = findViewById(R.id.lblthree);
//        lblfour = findViewById(R.id. lblfour);
//        lblfive = findViewById(R.id.lblfive);
//
//
//        lbltwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(WorkActivity.this, Img2Activity.class);
//                startActivity(intent);
//            }
//        });
//
//        lblthree.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent three = new Intent(WorkActivity.this, Img3Activity.class);
//                startActivity(three);
//            }
//        });
//
//        lblfour.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent four = new Intent(WorkActivity.this, Img4Activity.class);
//                startActivity(four);
//            }
//        });
//
//        lblfive.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent five = new Intent(WorkActivity.this, Img5Activity.class);
//                startActivity(five);
//            }
//        });











        facebook = findViewById(R.id.btnfacebok);
        insta = findViewById(R.id.btninstagram);
        twitter = findViewById(R.id.btntwitter);
        web = findViewById(R.id.btnweb);
        youtube = findViewById(R.id.btnyoutube);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = new Intent(Intent.ACTION_VIEW);
                facebook.setData(Uri.parse("https://www.facebook.com/nidhi.shinde.5817"));
                startActivity(facebook);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insta = new Intent(Intent.ACTION_VIEW);
                insta.setData(Uri.parse("https://www.facebook.com/public/Pramod-Shinde"));
                startActivity(insta);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twitter =  new Intent(Intent.ACTION_VIEW);
                twitter.setData(Uri.parse("https://twitter.com/pramodshinde"));
                startActivity(twitter);
            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse("https://www.youtube.com/results?search_query=pramod+shinde+pune"));
                startActivity(web);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent you  = new Intent(Intent.ACTION_VIEW);
                you.setData(Uri.parse("https://www.youtube.com/results?search_query=pramod+shinde+pune"));
            }
        });



    }
    @Override
    public void onBackPressed() {
        finish();
    }




}
