package com.hijabmay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TransaksiActivity extends AppCompatActivity {

    TextView txt_semua, txt_aktif,txt_selesai,txt_batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);

        txt_aktif = findViewById(R.id.txt_aktif);
        txt_aktif.setOnClickListener( v -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new PesananAktifFragment()).commit());

        txt_semua = findViewById(R.id.txt_semua);
        txt_semua.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new SemuaPesananFragment()).commit());

        txt_selesai = findViewById(R.id.txt_selesai);
        txt_selesai.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new PesananSelesaiFragment()).commit());

        txt_batal = findViewById(R.id.txt_batal);
        txt_batal.setOnClickListener(V -> getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new PesananBatalFragment()).commit());

    }
}