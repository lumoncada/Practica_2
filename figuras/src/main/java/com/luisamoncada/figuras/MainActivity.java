package com.luisamoncada.figuras;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    private RadioGroup Ropciones;
    private RadioButton Rcirculo;
    private RadioButton Rrectangulo;
    private RadioButton Rtriangulo;
    private RadioButton Rcuadrado;
    private EditText numerobase;
    private EditText numeroaltura;
    private EditText numerolado;
    private EditText numeroradio;
    private TextView tresultado;
    //private Button Bcalcular;
    static final double pi = 3.1416;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Rcuadrado = (RadioButton) findViewById(R.id.cuadrado);
        Rtriangulo = (RadioButton) findViewById(R.id.triangulo);
        Rrectangulo = (RadioButton) findViewById(R.id.rectangulo);
        Rcirculo = (RadioButton) findViewById(R.id.circulo);
        numerobase = (EditText) findViewById(R.id.nbase);
        numeroaltura = (EditText) findViewById(R.id.naltura);
        numerolado = (EditText) findViewById(R.id.nlado);
        numeroradio = (EditText) findViewById(R.id.nradio);
        tresultado = (TextView) findViewById(R.id.result);
        //Bcalcular = (Button) findViewById(R.id.calcular);
        Ropciones = (RadioGroup)findViewById(R.id.Opciones);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();


        Ropciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (Rcirculo.isChecked()) {
                    numerobase.setEnabled(false);
                    numerolado.setEnabled(false);
                    numeroaltura.setEnabled(false);
                    numeroradio.setEnabled(true);
                    numerobase.setText("");
                    numerolado.setText("");
                    numeroaltura.setText("");

                } else if (Rrectangulo.isChecked()) {
                    numerobase.setEnabled(true);
                    numerolado.setEnabled(false);
                    numeroaltura.setEnabled(true);
                    numeroradio.setEnabled(false);
                    numerolado.setText("");
                    numeroradio.setText("");

                } else if (Rtriangulo.isChecked()) {
                    numerobase.setEnabled(true);
                    numerolado.setEnabled(false);
                    numeroaltura.setEnabled(true);
                    numeroradio.setEnabled(false);
                    numerolado.setText("");
                    numeroradio.setText("");

                } else if (Rcuadrado.isChecked()) {
                    numerobase.setEnabled(false);
                    numerolado.setEnabled(true);
                    numeroaltura.setEnabled(false);
                    numeroradio.setEnabled(false);
                    numerobase.setText("");
                    numeroaltura.setText("");
                    numeroradio.setText("");

                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




    public void Resultado(View view) {



        if (Rcirculo.isChecked()) {
            String dradio = numeroradio.getText().toString();
            int radionumero = Integer.parseInt(dradio);
            double areacirculo = (radionumero * radionumero) * pi;
            String resultado = String.valueOf(areacirculo);
            tresultado.setText(resultado);

        } else if (Rrectangulo.isChecked()) {
            String dbase = numerobase.getText().toString();
            String daltura = numeroaltura.getText().toString();
            int basenumero = Integer.parseInt(dbase);
            int alturanumero = Integer.parseInt(daltura);

            int arearectangulo = basenumero * alturanumero;
            String resultado = String.valueOf(arearectangulo);
            tresultado.setText(resultado);

        } else if (Rtriangulo.isChecked()) {
            String dbase = numerobase.getText().toString();
            String daltura = numeroaltura.getText().toString();
            int basenumero = Integer.parseInt(dbase);
            int alturanumero = Integer.parseInt(daltura);
            int areatriangulo = (basenumero * alturanumero) / 2;
            String resultado = String.valueOf(areatriangulo);
            tresultado.setText(resultado);

        } else if (Rcuadrado.isChecked()) {
            String dlado = numerolado.getText().toString();
            int ladonumero = Integer.parseInt(dlado);
            int areacuadrado = ladonumero * ladonumero;
            String resultado = String.valueOf(areacuadrado);
            tresultado.setText(resultado);

        } else tresultado.setText("");

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.luisamoncada.figuras/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.luisamoncada.figuras/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}



