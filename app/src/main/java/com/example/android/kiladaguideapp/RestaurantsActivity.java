package com.example.android.kiladaguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Sight> sight = new ArrayList<>();
        sight.add(new Sight(R.string.aggelos , R.drawable.lafiotis));
        sight.add(new Sight(R.string.ntaglas,R.drawable.ntagklas));
        sight.add(new Sight(R.string.thodoris,R.drawable.lep));
        sight.add(new Sight(R.string.megas,R.drawable.tzi));
        sight.add(new Sight(R.string.german,R.drawable.ger));
        sight.add(new Sight(R.string.katerina,R.drawable.kate));
        SightAdapter adapter = new SightAdapter(this, sight);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}