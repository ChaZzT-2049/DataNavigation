package com.example.datanavigation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText Nombre;
    Button btnAl, btnDa, btnG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.Nombre);

        btnAl= findViewById(R.id.Alim);
        btnDa= findViewById(R.id.Agua);
        btnG= findViewById(R.id.gname);
        btnAl.setOnClickListener(this);
        btnDa.setOnClickListener(this);
        btnG.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        ImageView img1 = findViewById(R.id.comida);
        ImageView img2 = findViewById(R.id.bagua);
        if (view.getId()==btnAl.getId()){
            Toast.makeText(getApplicationContext(), "Alimentando a Pou",Toast.LENGTH_SHORT).show();
            img1.setVisibility(View.INVISIBLE);

        }
        if (view.getId()==R.id.Agua){
            Toast.makeText(getApplicationContext(), "Hidratando a Pou",Toast.LENGTH_SHORT).show();
            img2.setVisibility(View.INVISIBLE);

        }
        if (view.getId()==R.id.gname){
            Toast.makeText(getApplicationContext(), "Da clic en Datos de Pou para ver su nombre",Toast.LENGTH_LONG).show();
        }
    }
    //Btn guardar
    public void Guardar(View view) {
        Intent sav = new Intent(this, SecondActivity.class);
        sav.putExtra("dato", Nombre.getText().toString());
    }
    //Btn sig
    public void Cambiar(View view) {
        Intent sig = new Intent(this, SecondActivity.class);
        sig.putExtra("dato", Nombre.getText().toString());
        startActivity(sig);
    }
}