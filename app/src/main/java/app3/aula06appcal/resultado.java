package app3.aula06appcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
    private TextView edtResultado;
    private Intent intent;
    private String Resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        edtResultado = (TextView) findViewById(R.id.edtResultado);

        intent = getIntent();

        //armazena os números digitados
        Resul = intent.getStringExtra("Resultado");

        edtResultado.setText(Resul);
    }
}
