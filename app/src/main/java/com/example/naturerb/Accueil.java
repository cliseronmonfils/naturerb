package com.example.naturerb;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Accueil extends AppCompatActivity {

    private Button PageSTete;
    private Button PageSBrasG;
    private Button PageSBrasD;
    private Button PageSJambesG;
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


            case R.id.action_projet:
                final AlertDialog dialogueprojet = new AlertDialog.Builder(this, R.style.AlertDialog)
                        .setTitle("NaturErb")
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
