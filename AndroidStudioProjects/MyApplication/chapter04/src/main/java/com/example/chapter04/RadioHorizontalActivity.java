package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioHorizontalActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_horizontal);
        RadioGroup rg_gender = findViewById(R.id.rg_gender);
        tv_result = findViewById(R.id.tv_result);
        rg_gender.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rb_male){
            tv_result.setText("あなたはハンダサムな男の子です");
        }else if (checkedId == R.id.rb_female){
            tv_result.setText("あなたは綺麗な女の子です");
        }
    }
}