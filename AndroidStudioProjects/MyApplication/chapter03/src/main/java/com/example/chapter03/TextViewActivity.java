package com.example.chapter03;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TextViewActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText(R.string.hello);
    }
}