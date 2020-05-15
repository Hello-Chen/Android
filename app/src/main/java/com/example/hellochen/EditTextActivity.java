package com.example.hellochen;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        InputMethodManager mtext1 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mtext1.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
        InputMethodManager mtext2 = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        mtext2.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this, "登录", Toast.LENGTH_SHORT).show();
            }
        });
        Button register = findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditTextActivity.this,"注册",Toast.LENGTH_SHORT).show();
            }
        });
    }
}