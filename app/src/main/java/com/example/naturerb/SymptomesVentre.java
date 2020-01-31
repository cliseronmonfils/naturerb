package com.example.naturerb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SymptomesVentre extends AppCompatActivity {

    private Button PageBallo;
    private ImageButton PageAccueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptomes_ventre);

        PageAccueil = findViewById(R.id.imageButtonAccueil);
        PageBallo = findViewById(R.id.button1);

        PageBallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(Recette.class);
            }
        });
        PageAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(Accueil.class);
            }
        });


    }
    private void moveToPage(Class obj){
        Intent intent = new Intent (SymptomesVentre.this, obj);
        startActivity(intent);
    }

}
