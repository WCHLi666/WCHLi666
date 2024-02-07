package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditFocusActivity extends AppCompatActivity implements View.OnFocusChangeListener {

    private EditText et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_focus);
        et_phone = findViewById(R.id.et_phone);
        EditText et_password = findViewById(R.id.et_password);
        et_password.setOnFocusChangeListener(this);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if (hasFocus == true){
            String phone = et_phone.getText().toString();
            if (TextUtils.isEmpty(phone) || phone.length() < 11){
                et_phone.requestFocus();
                Toast.makeText(this, "11桁の携帯番号を入力しなさい", Toast.LENGTH_SHORT).show();
            }
        }
    }
}