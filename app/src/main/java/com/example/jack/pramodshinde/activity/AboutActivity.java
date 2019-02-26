package com.example.jack.pramodshinde.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.jack.pramodshinde.R;

public class AboutActivity extends AppCompatActivity {
    ImageButton facebook,insta,web,twitter,youtube;
    ImageView lblcall;

    String mono = "7447766109";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        lblcall = findViewById(R.id.call);
        lblcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mono));
                startActivity(intent);

            }
        });


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
