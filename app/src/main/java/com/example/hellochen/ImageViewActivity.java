package com.example.hellochen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        ImageView mIv = findViewById(R.id.iv_2);
        Glide.with(this).load("https://cn.bing.com/th?id=OHR.NorthRimOpens_ZH-CN9513300299_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp").into(mIv);
    }
}