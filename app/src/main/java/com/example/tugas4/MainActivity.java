package com.example.tugas4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CardView card;
    private EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card = findViewById(R.id.card);
        input = findViewById(R.id.input);
    }
    public void satu(View v){
        card.setVisibility(View.GONE);
        Intent satu = new Intent(this, ActivitySatu.class);
        startActivity(satu);
    }
    public void dua(View v){
        card.setVisibility(View.VISIBLE);
    }
    public void duaCard(View v){
        String isi = String.valueOf(input.getText());
        Intent dua = new Intent(this, ActivityDua.class);
        dua.putExtra("data", isi);
        startActivity(dua);
        card.setVisibility(View.GONE);
    }

    public void tiga(View v){
        card.setVisibility(View.GONE);
        Mobil mobilku = new Mobil();

        mobilku.setFerari(30);
        mobilku.setMclaren(20);
        mobilku.setMercedes(10);

        Intent tiga = new Intent(this, ActivityTiga.class);
        tiga.putExtra("mobilku",mobilku);
        startActivity(tiga);
    }
    public void empat(View v){
        card.setVisibility(View.GONE);
        Intent empat = new Intent(Intent.ACTION_DIAL);
        empat.setData(Uri.parse("tel:081315729920"));
        startActivity(empat);
    }
    public void lima(View v){
        card.setVisibility(View.GONE);
        Intent lima = new Intent(this, ActivityLima.class);
        startActivityForResult(lima, 7);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){
            if (requestCode == 7){

                String passedData = data.getStringExtra("data");

                TextView txtData = findViewById(R.id.txtHasil);
                txtData.setText(passedData);

            }
        }
    }
}