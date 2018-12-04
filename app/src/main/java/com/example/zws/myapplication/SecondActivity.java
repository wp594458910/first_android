package com.example.zws.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        if (null != msg) {
            Toast.makeText(SecondActivity.this, msg, Toast.LENGTH_SHORT).show();
        }

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("msg", "hello firstActivity");
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("msg", "hello firstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}
