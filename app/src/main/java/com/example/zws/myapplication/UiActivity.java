package com.example.zws.myapplication;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.zws.myapplication.utils.ToastUtils;

public class UiActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    private ProgressBar progressBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        Button button = findViewById(R.id.button);
        editText = findViewById(R.id.edit_text);
        button.setOnClickListener(this);

        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(this);
        imageView = findViewById(R.id.image_view);
        progressBar = findViewById(R.id.progress_bar);

        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(this);

        progressBar1 = findViewById(R.id.progress_bar_1);

        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(this);

        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                String inputString = editText.getText().toString();
                ToastUtils.toastMessage(UiActivity.this, inputString);
                break;
            case R.id.btn1:
                String str = editText.getText().toString();
                if(str.equals("1")){
                    imageView.setImageResource(R.drawable.img_1);
                }else{
                    imageView.setImageResource(R.drawable.img_2);
                }
                break;
            case R.id.btn2:
                if(progressBar.getVisibility()  == View.INVISIBLE){
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.btn3:
                int progress = progressBar1.getProgress();
                progress += 10;
                progressBar1.setProgress(progress);
                break;
            case R.id.btn4:
                AlertDialog.Builder dialog = new AlertDialog.Builder(UiActivity.this);
                dialog.setTitle("This is dialog");
                dialog.setMessage("something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ToastUtils.toastMessage(UiActivity.this, "ok");
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ToastUtils.toastMessage(UiActivity.this, "no");
                    }
                });
                dialog.show();
                break;
            case R.id.btn5:
                ProgressDialog progressDialog = new ProgressDialog(UiActivity.this);
                progressDialog.setTitle("this is progressDialog");
                progressDialog.setMessage("Loading....");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}
