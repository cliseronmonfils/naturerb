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

public class SymptomesTete extends AppCompatActivity {

    private Button PageChuteCheveux;
    private Button PageOtite;
    private Button PageEcoulement;
    private Button PageTouxGrasse;
    private Button PageTouxSeche;
    private Button PagePiqure;
    private Button PageHerpes;
    private Button PageMauxDeTete;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptomes_tete);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        PageChuteCheveux = findViewById(R.id.button4);
        PageOtite = findViewById(R.id.button2);
        PageEcoulement = findViewById(R.id.button3);
        PageTouxGrasse = findViewById(R.id.button5);
        PageTouxSeche = findViewById(R.id.button6);
        PagePiqure = findViewById(R.id.button7);
        PageHerpes = findViewById(R.id.button8);
        PageMauxDeTete = findViewById(R.id.button1);


        PageChuteCheveux.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecetteChuteCheveux.class);
            }
        });
        PageOtite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecetteOtite.class);
            }
        });
        PageEcoulement.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecetteEcoulement.class);
            }
        });
        PageTouxGrasse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecetteTouxGrasse.class);
            }
        });
        PageTouxSeche.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecetteTouxSeche.class);
            }
        });
        PagePiqure.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecettePiqure.class);
            }
        });
        PageHerpes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecetteHerpes.class);
            }
        });
        PageMauxDeTete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                moveToPage(RecetteMauxTete.class);
            }
        });

    }

    private void moveToPage(Class obj){
        Intent intent = new Intent (SymptomesTete.this, obj);
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
