package com.example.hellochen.Listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hellochen.R;

public class ListViewActivity extends AppCompatActivity {
    private ListView mLv_1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mLv_1 = findViewById(R.id.lv_1);
    }
}
