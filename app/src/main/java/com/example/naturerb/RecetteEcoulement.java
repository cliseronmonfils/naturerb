package com.example.naturerb;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class RecetteEcoulement extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recette_ecoulement_nazal);

        //menu
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

    }

    private void moveToPage(Class obj){
        Intent intent = new Intent (RecetteEcoulement.this, obj);
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

            case R.id.action_projet:
                final AlertDialog dialogueprojet = new AlertDialog.Builder(this)
                        .setTitle("Le projet NaturErb")
                        .setMessage(this.getResources().getString(R.string.presentation))
                        .setPositiveButton("Fermer", null)
                        .show()
                        ;
                Button positiveButton = dialogueprojet.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton.setTextColor(Color.parseColor("#FF0B8B42"));
                break;

            case R.id.action_equipe:
                final AlertDialog dialoguequipe = new AlertDialog.Builder(this)
                        .setTitle("L'équipe NaturErb")
                        .setMessage(this.getResources().getString(R.string.equipe))
                        .setPositiveButton("Fermer", null)
                        .show()
                        ;
                Button positiveButton2 = dialoguequipe.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton2.setTextColor(Color.parseColor("#FF0B8B42"));
                break;
            case R.id.action_mentions:
                final AlertDialog dialogmentions = new AlertDialog.Builder(this)
                        .setTitle("Mentions légales")
                        .setMessage(this.getResources().getString(R.string.cgu))
                        .setPositiveButton("Fermer", null)
                        .show()
                        ;
                Button positiveButton3 = dialogmentions.getButton(AlertDialog.BUTTON_POSITIVE);
                positiveButton3.setTextColor(Color.parseColor("#FF0B8B42"));
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
