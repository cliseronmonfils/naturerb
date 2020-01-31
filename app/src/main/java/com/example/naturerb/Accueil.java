package com.example.naturerb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Accueil extends AppCompatActivity {

    private ImageButton PageAcceuil;
    private ImageButton Menu;
    private Button PageSTete;
    private Button PageSBrasG;
    private Button PageSBrasD;
    private Button PageSJambesG;
    private Button PageSJambesD;
    private Button PageSVentre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        PageAcceuil = findViewById(R.id.logo_acceuil);
        PageSTete = findViewById(R.id.btntete);
        PageSBrasD = findViewById(R.id.btnbrasD);
        PageSBrasG = findViewById(R.id.btnbrasG);
        PageSJambesD = findViewById(R.id.btnjambeD);
        PageSJambesG = findViewById(R.id.btnjambeG);
        PageSVentre = findViewById(R.id.btnventre);

        PageAcceuil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(Accueil.class);
            }
        });
        PageSTete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(SymptomesTete.class);
            }
        });
        PageSBrasD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(SymptomesBras.class);
            }
        });
        PageSBrasG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(SymptomesBras.class);
            }
        });
        PageSJambesD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(SymptomesJambes.class);
            }
        });
        PageSJambesG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(SymptomesJambes.class);
            }
        });
        PageSVentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(SymptomesVentre.class);
            }
        });
    }

    private void moveToPage(Class obj){
        Intent intent = new Intent (Accueil.this, obj);
        startActivity(intent);
    }

}
