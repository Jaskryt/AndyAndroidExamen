package com.example.boton.examenandroidandy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pag1 = findViewById(R.id.CaF);
        Button pag2 = findViewById(R.id.FaC);
        Button pag3 = findViewById(R.id.CaK);
        Button pag4 = findViewById(R.id.KaC);
        pag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),CaF.class);
                startActivity(intent);
            }
        });
        pag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),FaC.class);
                startActivity(intent);
            }
        });
        pag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),CaK.class);
                startActivity(intent);
            }
        });
    }
}
