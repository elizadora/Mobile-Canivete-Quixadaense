package com.example.testewidgets;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // busca o elemento do tipo button pelo id

    Button btnContador, btnCalculadora;

    EditText editInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnContador = findViewById(R.id.btn_contador);
        btnCalculadora = findViewById(R.id.btn_calculadora);
        editInicial = findViewById(R.id.edit_inicial);




        // function onclick

        btnContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(editInicial.getText().toString())){
                    Log.d("Vai tafarel", "Mensagem de desespero");
                    Toast.makeText(MainActivity.this, "Preencha o campo para ir a tela", Toast.LENGTH_SHORT).show();
                }else{
                    Intent call = new Intent(MainActivity.this, ThirdActivity.class);
                    call.putExtra("valor", String.valueOf(editInicial.getText()));
                    startActivity(call);

                }
            }
        });

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(call);
            }
        });
    }
//    public void goToSecond(){
//        Intent call = new Intent(this, SecondActivity.class);
//        call.putExtra("ultimo_valor", String.valueOf(cont));
//        startActivity(call);
//    }
}