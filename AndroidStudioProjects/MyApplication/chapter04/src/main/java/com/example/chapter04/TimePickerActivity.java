package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

public class TimePickerActivity extends AppCompatActivity implements View.OnClickListener, TimePickerDialog.OnTimeSetListener {

    private TimePicker tp_time;
    private TextView tv_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        findViewById(R.id.btn_ok).setOnClickListener(this);
        findViewById(R.id.btn_time).setOnClickListener(this);
        tp_time = findViewById(R.id.tp_time);
        tp_time.setIs24HourView(true);
        tv_time = findViewById(R.id.tv_time);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_ok){
            String desc = String.format("あなたが選んだ時間は%d時%d分", tp_time.getHour(), tp_time.getMinute());
            tv_time.setText(desc);
        } else if (v.getId() == R.id.btn_time) {
            TimePickerDialog dialog = new TimePickerDialog(this, this, 12, 0, true);
            dialog.show();
        }
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String desc = String.format("あなたが選んだ時間は%d時%d分", hourOfDay, minute);
        tv_time.setText(desc);
    }
}