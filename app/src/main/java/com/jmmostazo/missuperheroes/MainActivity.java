/*
Jorge Martínez Mostazo
MisSuperheroes. App que nos permite registrar información sobre superhéroes
Elementos utilizados
1. Views: EditText, ImageView, TextView, RatingBar, Button
2. Linearayout, RelativeLayout, ConstraintLayout
3. Colors.xml
4. Github
 */
package com.jmmostazo.missuperheroes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.jmmostazo.missuperheroes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String NOMBRE = "nombre";
    public static final String ALTER_EGO = "alter_ego";
    public static final String HISTORIA = "historia";
    public static final String RATING = "rating";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //DataBinding
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.guardar.setOnClickListener(v->{
            String nombreHeroe = binding.nombreHeroe.getText().toString();
            String alterEgo = binding.alterEgo.getText().toString();
            String historia = binding.historia.getText().toString();
            Float rating = binding.ratingBar.getRating();

            openShowActivity(nombreHeroe,alterEgo,historia,rating);
        });

    }

    //Método que abre la Activity donde se detalla las características del superheroe
    //Usamos explicit intent donde indicamos la activity que deseamos abrir
    private void openShowActivity(String name, String alter, String historia, Float rate){
        Intent intent = new Intent(this,ShowActivity.class);
        intent.putExtra(NOMBRE,name);
        intent.putExtra(ALTER_EGO,alter);
        intent.putExtra(HISTORIA,historia);
        intent.putExtra(RATING,rate);
        startActivity(intent);
    }
}