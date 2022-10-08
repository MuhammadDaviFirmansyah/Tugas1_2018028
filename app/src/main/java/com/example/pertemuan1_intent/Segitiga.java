package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas =
                (EditText)findViewById(R.id.input_alas);
        final EditText tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        final EditText hasil =
                (EditText)findViewById(R.id.output_hasil);

        final Button hitung =
                (Button)findViewById(R.id.hitung);

        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();

                double alas = Double.parseDouble(alas1);
                double tinggi = Double.parseDouble(tinggi1);

                double total = (alas*tinggi)/2;

                String output = String.valueOf(total);
                hasil.setText(output.toString());
            }
        });
    }
}