package com.example.calculadoraderesistencias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calcular2 extends AppCompatActivity {

    private EditText etA;
    private EditText etB;
    private TextView tvA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular2);

        etA=(EditText)findViewById(R.id.etA);
        etB=(EditText)findViewById(R.id.etB);
        tvA=(TextView)findViewById(R.id.tvA);
    }

    public void ResistenciaP(View view) {
        String valor1=etA.getText().toString();
        String valor2=etB.getText().toString();
        int rA=Integer.parseInt(valor1);
        int rB=Integer.parseInt(valor2);
        //int resp=rA+rB; **fallo**
        //String resu=String.valueOf(resp);
        //tvA.setText(resu);
    }
}