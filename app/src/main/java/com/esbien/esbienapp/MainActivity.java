package com.esbien.esbienapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.esbien.esbienapp.objects.CallAPI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button enviar;
    CallAPI post;
    EditText mensaje;
    TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enviar = (Button) findViewById(R.id.btnEnviar);
        enviar.setOnClickListener(this);
        post = new CallAPI();
        mensaje = (EditText) findViewById(R.id.eTxtPrueba);
        respuesta = (TextView) findViewById(R.id.tvRespuesta);
    }


    public void onClick(View v){
        //respuesta.setText(mensaje.getText());
        String texto = mensaje.getText().toString();
        //tryLogin(texto);
        post.execute(texto);
    }





}
