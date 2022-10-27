package com.example.examenrepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnersActivity extends AppCompatActivity {
private Spinner spinner;
private EditText et1,et2;
private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinners);

        spinner = (Spinner) findViewById(R.id.spinner);
        et1 = (EditText) findViewById(R.id.introducido);
        et2 = (EditText) findViewById(R.id.introducido2);
        tv1 = (TextView) findViewById(R.id.mostrar);

        String[] opciones= {"MostrarPrimeroUsuario","MostrarPrimeroContra"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,opciones);
        spinner.setAdapter(adapter);


    }

    public void metodoMostrar(View view){
            String valor1 = et1.getText().toString();
            String valor2 = et2.getText().toString();

            String seleccion = spinner.getSelectedItem().toString();
            if (seleccion.equals("MostrarPrimeroUsuario")){
                tv1.setText(valor1+valor2);

            }else if (seleccion.equals("MostrarPrimeroContra")){
                tv1.setText(valor2+valor1);
            }

    }

}