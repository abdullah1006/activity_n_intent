package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);

        Mobil mobilku = (Mobil) getIntent().getSerializableExtra("mobilku");

        TextView txtFerari = findViewById(R.id.txtFerari);
        TextView txtMclaren = findViewById(R.id.txtMclaren);
        TextView txtMercedes = findViewById(R.id.txtMercedes);

        txtFerari.setText("Jumlah Ferari : " + mobilku.getFerari());
        txtMclaren.setText("Jumlah McLaren : " + mobilku.getMclaren());
        txtMercedes.setText("Jumlah Mercedes : " + mobilku.getMercedes());
    }

}