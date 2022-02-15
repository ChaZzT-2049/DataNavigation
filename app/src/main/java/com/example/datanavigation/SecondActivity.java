package com.example.datanavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txv = findViewById(R.id.txv_act2);
        String dato = getIntent().getStringExtra("dato");
        txv.setText("Nombre: " + dato);
    }

    //Btn back
    public void Regresar(View view){
        Intent ant = new Intent(this, MainActivity.class);
        startActivity(ant);
    }
}