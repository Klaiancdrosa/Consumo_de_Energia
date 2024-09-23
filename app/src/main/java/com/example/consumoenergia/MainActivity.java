package com.example.consumoenergia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editPotencia, editTempo, editCusto;
    private TextView txt, txtR1, txtR2;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);
        editPotencia = findViewById(R.id.editPotencia);
        editTempo = findViewById(R.id.editTempo);
        editCusto = findViewById(R.id.editCusto);
        txtR1 = findViewById(R.id.txtR1);
        txtR2 = findViewById(R.id.txtR2);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custodeEnergia();
            }
        });
    }

    private void custodeEnergia() {
        try {
            double potencia = Double.parseDouble(editPotencia.getText().toString());
            double tempo = Double.parseDouble(editTempo.getText().toString());
            double custoporKwh = Double.parseDouble(editCusto.getText().toString());
            double consumo = (potencia * tempo) / 1000;
            double custo = consumo * custoporKwh;
            txtR1.setText(String.format("Consumo: %.2f kWh", consumo));
            txtR2.setText(String.format("Custo: R$ %.2f", custo));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor, insira valores válidos", Toast.LENGTH_SHORT).show();
        }
    }
}
