package com.example.jack.pramodshinde;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements
        AdapterView.OnItemSelectedListener {
    String[] country = { "English", "Hindi", "China", "Japan", "Other"};
   // List<String> language = new ArrayList<>();







    String mono = "9763767218";
    Spinner spinner;
    Toolbar toolbar;
    ImageView lblcall;
    BottomNavigationView bottomNavigationView;
    LinearLayout linearLayout,linearLayout1,linearLayout2,linearLayout3,linearLayout4,linearLayout5,linearLayout6;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.facebook:
                    Intent login = new Intent(Intent.ACTION_VIEW);
                    login.setData(Uri.parse("https://www.facebook.com/public/Pramod-Shinde"));
                    startActivity(login);
                    return true;
                case R.id.web:
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.youtube.com/results?search_query=pramod+shinde+pune"));
                    startActivity(intent);
                    return true;
                case R.id.twitter:
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("https://twitter.com/pramodshinde"));
                    startActivity(intent2);
                    return true;

                case R.id.youtube:
                    Intent intent3 = new Intent(Intent.ACTION_VIEW);
                    intent3.setData(Uri.parse("https://www.youtube.com/results?search_query=pramod+shinde+pune"));
                    startActivity(intent3);
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        spinner = findViewById(R.id.spnnier);
        List<String> language =  new ArrayList<String>();
        language.add(0,"select language");
        language.add("Marathi");
        language.add("Hindi");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,language);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner.setSelection(i);

                if (i==1)
                {
                    Toast.makeText(getApplicationContext(),"you select Marathi",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"you select Hindi",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

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
                Intent job = new Intent(MainActivity.this, JobActivity.class);
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




    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
