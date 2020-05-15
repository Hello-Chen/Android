package com.example.hellochen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mbtn1;
    private Button mbtn2;
    private Button mbtn3;
    private Button mbtn4;
    private Button mbtn5;

    public ButtonActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        mbtn1=findViewById(R.id.button1);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"点击1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}