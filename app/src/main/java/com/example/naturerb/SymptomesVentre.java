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

public class SymptomesVentre extends AppCompatActivity {

    private Button PageBallo;
    private ImageButton PageAccueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptomes_ventre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        PageBallo = findViewById(R.id.button1);

        PageBallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToPage(Recette.class);
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
            // action with ID action_accueil was selected
            case R.id.action_accueil:
                moveToPage(Accueil.class);
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
