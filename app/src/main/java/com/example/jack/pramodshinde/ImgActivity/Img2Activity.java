package com.example.jack.pramodshinde.ImgActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.jack.pramodshinde.R;

public class Img2Activity extends AppCompatActivity {
    ImageView img1,img2,img3,img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img2);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
    }
}
