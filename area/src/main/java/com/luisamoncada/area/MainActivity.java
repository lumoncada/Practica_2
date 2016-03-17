package com.luisamoncada.area;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private TextView tv3;
    private RadioButton Rbn1;
    private RadioButton Rbn2;
    private RadioButton Rbn3;
    private RadioButton Rbn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        et1 = (EditText) findViewById(R.id.Lado);
        et2 = (EditText) findViewById(R.id.Altura);
        et3 = (EditText) findViewById(R.id.Base);
        et4 = (EditText) findViewById(R.id.Radio);
        tv3 = (TextView) findViewById(R.id.Resultado);
        Rbn1 = (RadioButton) findViewById(R.id.aradio);
        Rbn2 = (RadioButton) findViewById(R.id.acuadrado);
        Rbn3 = (RadioButton) findViewById(R.id.arectangulo);
        Rbn4 = (RadioButton) findViewById(R.id.atriangulo);
        Button btn1 = (Button) findViewById(R.id.calcular);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void Resultado(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();
        String valor4 = et4.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int nro3 = Integer.parseInt(valor3);
        int nro4 = Integer.parseInt(valor4);
        /*int suma=nro1+nro2;
        String resultado=String.valueOf(suma);
        tv3.setText(resultado);*/

        if (Rbn1.isChecked() == true) {
            int areac=nro4*nro4;
            String resultado=String.valueOf(areac);
            tv3.setText(resultado);
        }
        else if (Rbn2.isChecked()==true) {
            int areacd=nro1*nro1;
            String resultado=String.valueOf(areacd);
            tv3.setText(resultado);
        }
        else if (Rbn3.isChecked() == true) {
            int arear=nro3*nro2;
            String resultado=String.valueOf(arear);
            tv3.setText(resultado);
        }
        else if (Rbn4.isChecked()==true) {
            int areat=(nro3*nro2)/2;
            String resultado=String.valueOf(areat);
            tv3.setText(resultado);
        }
    }

}


