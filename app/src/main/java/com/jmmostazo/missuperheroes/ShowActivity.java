/**
 * @version 1.0
 * @author Jorge Martínez Mostazo
 */
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
        //Obtenemos valores desde el objeto Superheroe
        Superheroe sh = extras.getParcelable(MainActivity.SUPERHEROE);
        //Binding con la variable en xml superheroe enlazada a clase Superheroe
        binding.setSuperheroe(sh);
        /*
        //Binding realizado sin variable (<data>) en xml

        binding.showTituloHeroe.setText(sh.getName());
        binding.showalterEgo.setText(sh.getAlter_ego());
        binding.showHistoria.setText(sh.getHistoria());
        binding.showRatingBar.setRating(sh.getEnergia());

         */
        /*
        //Obtención de valores desde MainActivity sin crear objeto Superheroe
        String nombre = extras.getString(MainActivity.NOMBRE);
        String alter_ego = extras.getString(MainActivity.ALTER_EGO);
        String historia = extras.getString(MainActivity.HISTORIA);
        float rating = extras.getFloat(MainActivity.RATING);


        //Incluimos los valores en ShowActivity
        binding.showTituloHeroe.setText(nombre.);
        binding.showalterEgo.setText(alter_ego);
        binding.showHistoria.setText(historia);
        binding.showRatingBar.setRating(rating);

         */
    }
}