package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityDua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        String passedData = getIntent().getStringExtra("data") ;

        TextView txtHasil = findViewById(R.id.txtHasilPass);
        txtHasil.setText(passedData);
    }
}