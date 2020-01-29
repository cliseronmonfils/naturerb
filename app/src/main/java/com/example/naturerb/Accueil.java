package com.example.naturerb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Accueil extends AppCompatActivity {

    private ImageButton PageBouge;
    private Button PageTete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);
/*
        PageBouge = findViewById(R.id.logo_acceuil);
        PageTete = findViewById(R.id.tete);

        PageBouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage();
            }
        });
        PageTete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage();
            }
        });
    }
      private void moveToPage(){

        Intent intent = new Intent (Accueil.this, Accueil.class);
        startActivity(intent);
      }
*/

    }
}
