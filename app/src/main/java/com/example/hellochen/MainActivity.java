package com.example.hellochen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    //    声明变量
    private Button mBtnTextView;
    private Button mBtnButtonView;
    private Button mBtnEditTextView;
    private Button mBtnRadioButtonView;
    private Button mBtnCheckBoxView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        获取按键id
        mBtnTextView = findViewById(R.id.textView);
        mBtnButtonView = findViewById(R.id.buttonView);
        mBtnEditTextView = findViewById(R.id.editTextView);
        mBtnRadioButtonView = findViewById(R.id.radioButtonView);
        mBtnCheckBoxView = findViewById(R.id.checkBoxView);

        setListeners();
    }

    private void setListeners() {
//        设置监听事件
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButtonView.setOnClickListener(onClick);
        mBtnEditTextView.setOnClickListener(onClick);
        mBtnRadioButtonView.setOnClickListener(onClick);
        mBtnCheckBoxView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        Intent intent = null;

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
//                切换到TextView界面
                case R.id.textView:
                    intent = new Intent(MainActivity.this, TextActivity.class);
                    break;
                case R.id.buttonView:
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.editTextView:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.radioButtonView:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.checkBoxView:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}