package app3.aula06appcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class MainActivity extends AppCompatActivity{

    private EditText edtValor1;
    private EditText edtValor2;

    private Button btnSoma;
    private Button btnSub;
    private Button btnMult;
    private Button btnDiv;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);

        btnSoma = (Button) findViewById(R.id.btnSoma);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        intent = new Intent(this,resultado.class);


        btnSoma.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String n1 = edtValor1.getText().toString();
                String n2 = edtValor2.getText().toString();

                if (n1.trim().isEmpty() || n2.trim().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Um ou mais campos em branco", Toast.LENGTH_SHORT).show();
                } else {

                    double valor1 = Double.parseDouble(edtValor1.getText().toString());
                    double valor2 = Double.parseDouble(edtValor2.getText().toString());

                    String resultado = String.valueOf(valor1 + valor2);

                    intent.putExtra("Resultado",resultado);

                    startActivity(intent);

                }


            }

        });

        btnSub.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String n1 = edtValor1.getText().toString();
                String n2 = edtValor2.getText().toString();

                if (n1.trim().isEmpty() || n2.trim().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Um ou mais campos em branco", Toast.LENGTH_LONG).show();
                } else {

                    double valor1 = Double.parseDouble(edtValor1.getText().toString());
                    double valor2 = Double.parseDouble(edtValor2.getText().toString());

                    String resultado = String.valueOf(valor1 - valor2);

                    intent.putExtra("Resultado",resultado);
                    startActivity(intent);
                }


            }

        });

        btnMult.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String n1 = edtValor1.getText().toString();
                String n2 = edtValor2.getText().toString();

                if (n1.trim().isEmpty() || n2.trim().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Um ou mais campos em branco", Toast.LENGTH_LONG).show();
                } else {

                    double valor1 = Double.parseDouble(edtValor1.getText().toString());
                    double valor2 = Double.parseDouble(edtValor2.getText().toString());

                    String resultado = String.valueOf(valor1 * valor2);

                    intent.putExtra("Resultado",resultado);
                    startActivity(intent);


                }


            }

        });

        btnDiv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String n1 = edtValor1.getText().toString();
                String n2 = edtValor2.getText().toString();

                if (n1.trim().isEmpty() || n2.trim().isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Um ou mais campos em branco", Toast.LENGTH_LONG).show();
                } else {

                    double valor1 = Double.parseDouble(edtValor1.getText().toString());
                    double valor2 = Double.parseDouble(edtValor2.getText().toString());

                    String resultado = String.valueOf(valor1 / valor2);

                    intent.putExtra("Resultado",resultado);
                    startActivity(intent);

                }


            }

        });

    }
}

