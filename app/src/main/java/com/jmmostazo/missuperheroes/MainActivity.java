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

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}