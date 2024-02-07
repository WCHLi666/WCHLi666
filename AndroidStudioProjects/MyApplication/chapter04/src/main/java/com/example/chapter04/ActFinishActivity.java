package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActFinishActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_finish);
        findViewById(R.id.ic_back).setOnClickListener(this);
        findViewById(R.id.btn_finish).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ic_back || v.getId() == R.id.btn_finish){
            finish();
        }
    }
}