package com.example.testewidgets;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {

    int cont = 0;

    Button btnIncrementar;
    TextView tvContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);

        btnIncrementar = findViewById(R.id.btn_incrementar);
        tvContador = findViewById(R.id.tv_contador);

        Intent i = getIntent();
        String texto = i.getStringExtra("valor");
        Log.d("valor", "Esse eh o ultimo valor:" + texto);
        cont = Integer.parseInt(texto);
        tvContador.setText(texto);


        btnIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont++;
                tvContador.setText(String.valueOf(cont));
            }
        });
    }

}