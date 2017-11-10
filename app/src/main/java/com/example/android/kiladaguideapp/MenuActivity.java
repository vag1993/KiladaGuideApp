package com.example.android.kiladaguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageButton sight = (ImageButton) findViewById(R.id.imageSight);
        ImageButton beaches = (ImageButton) findViewById(R.id.imageBeaches);
        ImageButton nightlife = (ImageButton) findViewById(R.id.imageNightlife);
        ImageButton restaurants = (ImageButton) findViewById(R.id.imageRestaurants);
        sight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sightIntent = new Intent(MenuActivity.this, SightsActivity.class);
                startActivity(sightIntent);
            }
        });
        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beachesIntent = new Intent(MenuActivity.this, BeachesActivity.class);
                startActivity(beachesIntent);
            }
        });
        nightlife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightlifeIntent = new Intent(MenuActivity.this, NightlifeActivity.class);
                startActivity(nightlifeIntent);
            }
        });
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MenuActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });
    }
}
