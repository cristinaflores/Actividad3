package com.example.miell_000.nuevousuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Detalle_2Activity extends AppCompatActivity {

    private TextView tvUsuario;
    private Button btnMarcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_2);

        //asigno controles. Instancio
        tvUsuario = (TextView) findViewById(R.id.tvUsuario);
        btnMarcar = (Button) findViewById(R.id.btnMarcar);


        //extraer la info que trae de la otra pantalla
        Bundle bundle = getIntent().getExtras();

        //muestro lo que obtengo en el text view
        String usuario = bundle.getString("Info").toString();
        tvUsuario.setText(usuario);

    }
}
