package com.example.android.kiladaguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NightlifeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Sight> sight = new ArrayList<>();
        sight.add(new Sight(R.string.lekkas , R.drawable.lek));
        sight.add(new Sight(R.string.stapas,R.drawable.retro));
        sight.add(new Sight(R.string.valley,R.drawable.valey));
        sight.add(new Sight(R.string.tzitzikas,R.drawable.tzi));
        sight.add(new Sight(R.string.flo,R.drawable.flo));
        SightAdapter adapter = new SightAdapter(this, sight);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}