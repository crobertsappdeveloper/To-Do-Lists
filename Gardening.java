package com.example.android.todolists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Gardening extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gardening);
        
        ArrayList<String> gardening = new ArrayList<String>();

        gardening.add("Mowing the lawn");
        gardening.add("Watering the plants");
        gardening.add("Weeding");
        gardening.add("Trimming the hedges");
        gardening.add("Painting the shed");
        gardening.add("Building a tree house");
        gardening.add("Re-filling the bird seeder");
        gardening.add("Digging out the borders");
        gardening.add("Planting the new plants");
        gardening.add("Picking fruit from the trees");
        gardening.add("Strimming the long grass");
        gardening.add("Powercleaning the slabs");
        gardening.add("Cleaning tools, pots, etc.");
        gardening.add("Clearing away the rubbish");
        gardening.add("Relaxing and having a beer");

        for (int index = 0; index < gardening.size(); index++) {
            LinearLayout rootView = (LinearLayout) findViewById(R.id.gardeningview);
            TextView wordView = new TextView(this);
            wordView.setText(gardening.get(index));
            rootView.addView(wordView);
        }
    }
}
