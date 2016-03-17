package com.luisamoncada.calcular;

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
    private TextView tv3;
    private RadioButton Rbn1;
    private RadioButton Rbn2;
    private RadioButton Rbn3;
    private RadioButton Rbn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        et1 = (EditText) findViewById(R.id.Numero1);
        et2 = (EditText) findViewById(R.id.Numero2);
        tv3 = (TextView) findViewById(R.id.Resultado);
        Rbn1 = (RadioButton) findViewById(R.id.sumar);
        Rbn2 = (RadioButton) findViewById(R.id.restar);
        Rbn3 = (RadioButton) findViewById(R.id.multiplicar);
        Rbn4 = (RadioButton) findViewById(R.id.dividir);
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
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        /*int suma=nro1+nro2;
        String resultado=String.valueOf(suma);
        tv3.setText(resultado);*/

        if (Rbn1.isChecked() == true) {
            int suma=nro1+nro2;
            String resultado=String.valueOf(suma);
            tv3.setText(resultado);
        }
        else if (Rbn2.isChecked()==true) {
            int resta=nro1-nro2;
            String resultado=String.valueOf(resta);
            tv3.setText(resultado);
        }
        else if (Rbn3.isChecked() == true) {
            int multiplicar=nro1*nro2;
            String resultado=String.valueOf(multiplicar);
            tv3.setText(resultado);
        }
        else if (Rbn4.isChecked()==true) {
            int dividir=nro1/nro2;
            String resultado=String.valueOf(dividir);
            tv3.setText(resultado);
        }
    }

}





   /*@Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        })
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;}}*/


