package com.example.naturerb;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SymptomesVentre extends AppCompatActivity {

    private Button PageBallo;
    private Button PageHerpes;
    private Button PageCoupDeSoleil;
    private Button PagePiqure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptomes_ventre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        PageBallo = findViewById(R.id.buttonB);
        PageHerpes = findViewById(R.id.buttonH);
        PageCoupDeSoleil = findViewById(R.id.buttonC);
        PagePiqure = findViewById(R.id.buttonP);

        PageBallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(RecetteBallonement.class);
            }
        });

        PageHerpes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(RecetteHerpes.class);
            }
        });

        PageCoupDeSoleil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(RecetteCoupDeSoleil.class);
            }
        });

        PagePiqure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(RecettePiqure.class);
            }
        });


    }
    private void moveToPage(Class obj){
        Intent intent = new Intent (SymptomesVentre.this, obj);
        startActivity(intent);
    }

    //menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater infalter = getMenuInflater();
        infalter.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //menu bar items
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.action_accueil:
                moveToPage(Accueil.class);
            break;

            case R.id.action_projet:
                final AlertDialog dialogueprojet = new AlertDialog.Builder(this, R.style.AlertDialog)
                        .setTitle("Le projet NaturErb")
                        .setMessage(this.getResources().getString(R.string.presentation))
                        .setPositiveButton("Fermer", null)
                        .show()
                        ;
                Button positiveButton = dialogueprojet.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setTextColor(Color.parseColor("#ffffff"));
                dialogueprojet.getWindow().setBackgroundDrawable(new ColorDrawable(0xFF70AD47));
                break;

            case R.id.action_equipe:
                final AlertDialog dialoguequipe = new AlertDialog.Builder(this, R.style.AlertDialog)
                        .setTitle("L'équipe NaturErb")
                        .setMessage(this.getResources().getString(R.string.equipe))
                        .setPositiveButton("Fermer", null)
                        .show()
                        ;
                Button positiveButton2 = dialoguequipe.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton2.setTextColor(Color.parseColor("#ffffff"));
                dialoguequipe.getWindow().setBackgroundDrawable(new ColorDrawable(0xFF70AD47));
                break;
            case R.id.action_mentions:
                final AlertDialog dialogmentions = new AlertDialog.Builder(this, R.style.AlertDialog)
                        .setTitle("Mentions légales")
                        .setMessage(this.getResources().getString(R.string.cgu))
                        .setPositiveButton("Fermer", null)
                        .show()
                        ;
                Button positiveButton3 = dialogmentions.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton3.setTextColor(Color.parseColor("#ffffff"));
                dialogmentions.getWindow().setBackgroundDrawable(new ColorDrawable(0xFF70AD47));
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
