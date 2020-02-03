package com.example.naturerb;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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
        //menu
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        //fin menu

        PageSTete = findViewById(R.id.btntete);
        PageSBrasD = findViewById(R.id.btnbrasD);
        PageSBrasG = findViewById(R.id.btnbrasG);
        PageSJambesD = findViewById(R.id.btnjambeD);
        PageSJambesG = findViewById(R.id.btnjambeG);
        PageSVentre = findViewById(R.id.btnventre);

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

    //menu bar
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater infalter = getMenuInflater();
        infalter.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //menu bar items
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_accueil was selected
            case R.id.action_accueil:

                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
