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
    private Button mBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        获取按键id 强制转换为button类型
        mBtnTextView = (Button) findViewById(R.id.textView);
        mBtnButtonView = (Button) findViewById(R.id.buttonView);
        mBtnEditTextView = (Button) findViewById(R.id.editTextView);
        mBtnRadioButtonView = (Button) findViewById(R.id.radioButtonView);
        mBtnCheckBoxView = (Button) findViewById(R.id.checkBoxView);
        mBtnImageView = (Button) findViewById(R.id.imageView);
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
        mBtnImageView.setOnClickListener(onClick);
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
                case R.id.imageView:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}