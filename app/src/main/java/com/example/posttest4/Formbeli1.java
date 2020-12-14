package com.example.posttest4;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.CheckBox;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.sql.Ref;
public class Formbeli1 extends AppCompatActivity {

    private EditText Nama;
    private EditText noHP;
    private EditText Alamat;
    private RadioButton Cash;
    private RadioButton Tranfer;
    private RadioButton Cicil;
    private RadioButton CreditCard;
    private CheckBox Redretro;
    private CheckBox Blueneko;

    private TextView TampilNama;
    private TextView TampilNoHP;
    private TextView TampilAlamat;
    private TextView TampilPembayaran;
    private TextView TampilItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formbeli1);
        Nama = (EditText)findViewById(R.id.nama);
        noHP = (EditText)findViewById(R.id.noHP);
        Alamat = (EditText)findViewById(R.id.alamat);
        Cash = (RadioButton)findViewById(R.id.cash);
        Tranfer = (RadioButton)findViewById(R.id.tranfer);
        Cicil = (RadioButton)findViewById(R.id.cicil);
        CreditCard = (RadioButton)findViewById(R.id.creditCard);
        Redretro = (CheckBox)findViewById(R.id.redretro);
        Blueneko  = (CheckBox)findViewById(R.id.blueneko);

    }

    public void hasil(View view){
        setContentView(R.layout.activity_struck);
        TampilNama = (TextView)findViewById(R.id.TampilNama);
        TampilNama.setText(Nama.getText());

        TampilAlamat = (TextView)findViewById(R.id.TampilAlamat);
        TampilAlamat.setText(Alamat.getText());

        TampilNoHP = (TextView)findViewById(R.id.TampilnoHP);
        TampilNoHP.setText(noHP.getText());

        TampilPembayaran = (TextView)findViewById(R.id.TampilPembayaran);
        if (Cash.isChecked()) TampilPembayaran.setText(Cash.getText());
        if (Tranfer.isChecked()) TampilPembayaran.setText(Tranfer.getText());
        if (Cicil.isChecked()) TampilPembayaran.setText(Cicil.getText());
        if (CreditCard.isChecked()) TampilPembayaran.setText(CreditCard.getText());

        TampilItem = (TextView)findViewById(R.id.TampilItem);
        if (Redretro.isChecked()) TampilItem.setText(Redretro.getText());
        if (Blueneko.isChecked()) TampilItem.setText(Blueneko.getText());

    }
}




