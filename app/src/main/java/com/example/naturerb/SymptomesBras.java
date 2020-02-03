package com.example.naturerb;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SymptomesBras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptomes_bras);
        //menu
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
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
    private void moveToPage(Class obj){
        Intent intent = new Intent (SymptomesBras.this, obj);
        startActivity(intent);
    }
}
