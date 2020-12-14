package com.example.posttest4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalamanAwal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
    }

    public void beli1(View view) {
        Intent beli1 = new Intent(HalamanAwal.this, Formbeli1.class);
        startActivity(beli1);
    }
}