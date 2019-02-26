package com.example.jack.pramodshinde;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jack.pramodshinde.activity.AboutActivity;
import com.example.jack.pramodshinde.activity.AppointmentActivity;
import com.example.jack.pramodshinde.activity.ComplaintActivity;
import com.example.jack.pramodshinde.activity.ContactActivity;
import com.example.jack.pramodshinde.activity.GalleryActivity;
import com.example.jack.pramodshinde.activity.JobActivity;
import com.example.jack.pramodshinde.activity.WorkActivity;
import com.example.jack.pramodshinde.marathiActivit.MarathiMainActivity;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired time passed between two back presses.
    private long mBackPressed;


    ImageButton facebook,insta,web,twitter,youtube;

    Locale myLocale;

    String mono = "7447766109";
    Spinner spinner;
    Toolbar toolbar;
    ImageView lblcall;
    BottomNavigationView bottomNavigationView;
    LinearLayout linearLayout,linearLayout1,linearLayout2,linearLayout3,linearLayout4,linearLayout5,linearLayout6;





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);



        spinner = findViewById(R.id.spnnier);
        List<String> language =  new ArrayList<String>();
        language.add(0,"Select Language");
       // language.add("English");
        language.add("Marathi");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,language);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {





//
                if (position==1)
                {
                    Intent intent = new Intent(MainActivity.this, MarathiMainActivity.class);
                    Toast.makeText(getApplicationContext(), "निवडलेली भाषा मराठी",Toast.LENGTH_SHORT).show();
                    startActivity(intent);


                }
//
//
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

                Toast.makeText(getApplicationContext(),"निवडलेली भाषा मराठी",Toast.LENGTH_SHORT).show();
            }
        });






        lblcall = findViewById(R.id.call);
        lblcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mono));
                startActivity(intent);

            }
        });


        linearLayout = findViewById(R.id.layout1);
        linearLayout1 = findViewById(R.id.layout2);
        linearLayout2 = findViewById(R.id.layout3);
        linearLayout3 = findViewById(R.id.layout4);
        linearLayout4 = findViewById(R.id.layout5);
        linearLayout5 = findViewById(R.id.layout6);
        linearLayout6 = findViewById(R.id.layout7);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,AboutActivity.class);
               startActivity(intent);
            }
        });

        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent work = new Intent(MainActivity.this, WorkActivity.class);
                startActivity(work);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String url = "https://portal.mcgm.gov.in/irj/portal/anonymous?NavigationTarget=navurl://6b24cfc8a981ecd7d877601622c34785https://portal.mcgm.gov.in/irj/portal/anonymous?NavigationTarget=navurl://6b24cfc8a981ecd7d877601622c34785";
                Intent job = new Intent(MainActivity.this,JobActivity.class);
              //  job.setData(Uri.parse("https://portal.mcgm.gov.in/irj/portal/anonymous?NavigationTarget=navurl://6b24cfc8a981ecd7d877601622c34785https://portal.mcgm.gov.in/irj/portal/anonymous?NavigationTarget=navurl://6b24cfc8a981ecd7d877601622c34785"));
                startActivity(job);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent complaint = new Intent(MainActivity.this, ComplaintActivity.class);
                startActivity(complaint);
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appi  = new Intent(MainActivity.this, AppointmentActivity.class);
                startActivity(appi);
            }
        });

        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contact = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(contact);
            }
        });

        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery =  new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(gallery);
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
    public void setLocale(String lang) {


        myLocale = new Locale(lang);

        Resources res = getResources();

        DisplayMetrics dm = res.getDisplayMetrics();

        Configuration conf = res.getConfiguration();

        conf.locale = myLocale;

        res.updateConfiguration(conf, dm);

        Intent refresh = new Intent(this, MainActivity.class);

        startActivity(refresh);

    }

    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}
