package com.example.android.kiladaguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Sight> sight = new ArrayList<>();
        sight.add(new Sight(R.string.fraght , R.drawable.fran));
        sight.add(new Sight(R.string.evange,R.drawable.eveklisia));
        sight.add(new Sight(R.string.panag,R.drawable.panagia));
        sight.add(new Sight(R.string.ugro,R.drawable.ugro));
        sight.add(new Sight(R.string.nick,R.drawable.stnick));
        SightAdapter adapter = new SightAdapter(this, sight);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
