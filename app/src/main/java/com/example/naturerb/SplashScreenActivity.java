package com.example.naturerb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //rediriger vers la page principale "MainActivity" après un certain délais
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //demarrer une page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class) ;
                startActivity(intent);
                finish();

            }
        };

        //Handler post delayed
        new Handler().postDelayed(runnable, 3000);
    }
}

