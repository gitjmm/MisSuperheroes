package com.jmmostazo.missuperheroes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jmmostazo.missuperheroes.databinding.ActivityShowBinding;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_show);
        ActivityShowBinding binding = ActivityShowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Obtenemos los valores desde el MainActivity
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString(MainActivity.NOMBRE);
        String alter_ego = extras.getString(MainActivity.ALTER_EGO);
        String historia = extras.getString(MainActivity.HISTORIA);
        float rating = extras.getFloat(MainActivity.RATING);
        //Incluimos los valores en ShowActivity
        binding.showTituloHeroe.setText(nombre);
        binding.showalterEgo.setText(alter_ego);
        binding.showHistoria.setText(historia);
        binding.showRatingBar.setRating(rating);
    }
}