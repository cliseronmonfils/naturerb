package com.example.naturerb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Recette extends AppCompatActivity {

    private ImageButton PageAccueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recette);

        PageAccueil = findViewById(R.id.logo_acceuil);

        PageAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(Accueil.class);
            }
        });

    }

    private void moveToPage(Class obj){
        Intent intent = new Intent (Recette.this, obj);
        startActivity(intent);
    }
}
