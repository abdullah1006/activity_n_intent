package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityLima extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lima);
    }
    public void back(View v){
        EditText inData = findViewById(R.id.inData);
        String data = inData.getText().toString();

        Intent i = new Intent();
        i.putExtra("data", data);
        setResult(RESULT_OK, i);
        finish();
    }
}