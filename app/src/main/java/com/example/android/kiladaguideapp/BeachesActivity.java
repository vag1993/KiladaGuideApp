package com.example.android.kiladaguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Sight> sight = new ArrayList<>();
        sight.add(new Sight(R.string.lepitsa , R.drawable.lep));
        sight.add(new Sight(R.string.evangebeach,R.drawable.evangelistria));
        sight.add(new Sight(R.string.doroufi,R.drawable.doroufi));
        sight.add(new Sight(R.string.thunilakkes,R.drawable.thuni));
        sight.add(new Sight(R.string.vroxitsa,R.drawable.vr));
        SightAdapter adapter = new SightAdapter(this, sight);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}