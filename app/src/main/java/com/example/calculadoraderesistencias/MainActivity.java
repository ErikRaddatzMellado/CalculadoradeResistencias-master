package com.example.calculadoraderesistencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Calcular(View view) {
        Intent i = new Intent(this, Calcular.class );
        startActivity(i);
    }

    public void Calcular2(View view) {
        Intent i = new Intent(this, Calcular2.class );
        startActivity(i);
    }

}
