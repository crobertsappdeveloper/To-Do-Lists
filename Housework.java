package com.example.android.todolists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Housework extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housework);
        
        ArrayList<String> housework = new ArrayList<String>();

        housework.add("Doing the laundry");
        housework.add("Vacuuming");
        housework.add("Cleaning");
        housework.add("Polishing the furniture");
        housework.add("Emptying the bins");
        housework.add("Mopping the floors");
        housework.add("Maintaining the household appliances");
        housework.add("Loading the dishwasher");
        housework.add("Putting away the dishes");
        housework.add("De-cluttering");

        for (int index = 0; index < housework.size(); index++) {
            LinearLayout rootView = (LinearLayout) findViewById(R.id.houseworkview);
            TextView wordView = new TextView(this);
            wordView.setText(housework.get(index));
            rootView.addView(wordView);
        }
    }
}
