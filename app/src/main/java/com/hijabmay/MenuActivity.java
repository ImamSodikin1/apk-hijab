package com.hijabmay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MenuActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_bottom);
        bottomNavigationView.setOnItemSelectedListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.icon_home:
                Toast.makeText(this, "This Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icon_transaksi:
                Intent transaksi = new Intent(MenuActivity.this, TransaksiActivity.class);
                startActivity(transaksi);
                break;
            case R.id.icon_pesan:
                Toast.makeText(this, "This Message", Toast.LENGTH_SHORT).show();
                break;
            case R.id.icon_profile:
                Toast.makeText(this, "This Profile", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}