package com.example.chapter04;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlertDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        Button btn_alert = findViewById(R.id.btn_alert);
        btn_alert.setOnClickListener(this);
        tv_alert = findViewById(R.id.tv_alert);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("お客様");
        builder.setMessage("本当にアンインストールしますか");
        builder.setPositiveButton("酷いアンインストールします", (dialog, which) -> {
            tv_alert.setText("I will missing you");
        });

        builder.setNegativeButton("考え直す", (dialog, which) -> {
            tv_alert.setText("一緒に何をしに行きましょう");
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}