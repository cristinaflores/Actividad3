package com.example.miell_000.nuevousuario;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    private EditText edtUsuario;
    private EditText edtClave;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        //asigno controles
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtClave = (EditText) findViewById(R.id.edtClave);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);


       //metodo para gestion de evento clic del boton
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //llama a la otra pantalla
                Intent intent = new Intent(Inicio.this, Detalle_2Activity.class);
                //informacion que mando a la otra pantalla
                intent.putExtra("Info", edtUsuario.getText().toString());
                //ejecutamos la pantalla siguiente
                startActivity(intent);

            }
        });

    }





}
