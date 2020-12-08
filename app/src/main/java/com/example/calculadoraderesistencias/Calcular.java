package com.example.calculadoraderesistencias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calcular extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);
    }

    public void ResistenciaS(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int r1=Integer.parseInt(valor1);
        int r2=Integer.parseInt(valor2);
        int ress=r1+r2;
        String resu=String.valueOf(ress);
        tv1.setText(resu);
    }
}
