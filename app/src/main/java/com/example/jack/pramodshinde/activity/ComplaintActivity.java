package com.example.jack.pramodshinde.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.jack.pramodshinde.R;

import java.util.ArrayList;
import java.util.List;

public class ComplaintActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    List<String> country ;//= { "Akash Inkar", "Kiran Jadhav", "Gopal Jogdand", "Kiran Patil", "Shubham Todkar"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
       spinner =  findViewById(R.id.spinnerc);
        spinner.setOnItemSelectedListener(this);
        country = new ArrayList<String>();
        country.add("Akash Inkar");
        country.add("Gopal Jogdand");
        country.add("Kiran Jadhav");

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);

    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l)
    {


        String item = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(), country.get(position), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    @Override
    public void onBackPressed() {
        finish();
    }

}
