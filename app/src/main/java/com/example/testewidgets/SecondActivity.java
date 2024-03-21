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

public class SecondActivity extends AppCompatActivity {

    EditText editNum1, editNum2;
    Button btnSomar, btnSub, btnDiv, btnMulti;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);


        editNum1 = findViewById(R.id.edit_num_1);
        editNum2 = findViewById(R.id.edit_num_2);

        btnSomar = findViewById(R.id.btn_somar);
        btnSub = findViewById(R.id.btn_sub);
        btnDiv = findViewById(R.id.btn_div);
        btnMulti = findViewById(R.id.btn_multi);

        tvResultado = findViewById(R.id.tv_resultado);


        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(verifyInputs()){
                    double num1, num2;
                    num1 = Double.valueOf(editNum1.getText().toString());
                    num2 = Double.valueOf(editNum2.getText().toString());

                    tvResultado.setText(String.format("%.3f", (num1 + num2)));
                }

            }
        });


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(verifyInputs()){
                    double num1, num2;
                    num1 = Double.valueOf(editNum1.getText().toString());
                    num2 = Double.valueOf(editNum2.getText().toString());

                    tvResultado.setText(String.format("%.3f", (num1 - num2)));
                }
            }
        });


        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(verifyInputs()){
                    double num1, num2;
                    num1 = Double.valueOf(editNum1.getText().toString());
                    num2 = Double.valueOf(editNum2.getText().toString());

                    tvResultado.setText(String.format("%.3f", (num1 * num2)));
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(verifyInputs()){
                    double num1, num2;
                    num1 = Double.valueOf(editNum1.getText().toString());
                    num2 = Double.valueOf(editNum2.getText().toString());

                    if(num2 == 0){
                        Toast.makeText(SecondActivity.this, "Divisao por 0 nao eh valida", Toast.LENGTH_SHORT).show();
                    }else{
                        tvResultado.setText(String.format("%.3f", (num1 / num2)));
                    }
                }
            }
        });

    }



    public boolean verifyInputs(){
        if(TextUtils.isEmpty(editNum1.getText().toString()) || TextUtils.isEmpty(editNum2.getText().toString())){
            Toast toast = Toast.makeText(SecondActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT);
            toast.show();
            return false;
        }

        return true;
    }
}