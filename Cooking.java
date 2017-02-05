package com.example.android.todolists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/* Defining the class so it extends/uses features from AppCompatActivity which is a base style */
public class Cooking extends AppCompatActivity {

    /* onCreate method which is for initialising your activity and the bulk of your commands need to be below this method and inbetween the brackets */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         /* Set the content of the activity to use the activity_cooking.xml layout file */
        setContentView(R.layout.activity_cooking);

        /* Defines the ArrayList to use String values */
        ArrayList<String> cooking = new ArrayList<String>();

        /* Adds all the values to the Arraylist */
        cooking.add("Chopping the vegetables");
        cooking.add("Marinating the meat");
        cooking.add("Boiling the rice in a pan");
        cooking.add("Frying the meat and vegetables");
        cooking.add("Adding the sauce");
        cooking.add("Dishing out the dinner");
        cooking.add("Laying the table");
        cooking.add("Opening the wine");
        cooking.add("Pouring the wine into the glasses");
        cooking.add("Preparing the dessert");
        cooking.add("Dishing out the dessert");
        cooking.add("Washing the dishes");

        /* For Loop that runs continuously on condition that the index integer is lower than the total quantity of the Arraylist */
        /* the integer index is first given a value of 0 and the value of index increases by 1 each time the For loop runs */

        for (int index = 0; index < cooking.size(); index++) {

            /* Assigns the id of the LinearLayout to rootView */
            LinearLayout rootView = (LinearLayout) findViewById(R.id.cookingview);

            /* Sets wordView into a TextView */
            TextView wordView = new TextView(this);

            /* Bases on the value of index gets the appropriate value in the Arraylist and adds this to wordView */
            wordView.setText(cooking.get(index));

            /* Displays a line of text on the screen in rootView (LinearLayout) */
            /* This is using wordView which is a TextView object based on appropriate value from Arraylist from the index variable which increases by 1 every time this loop is run */
            rootView.addView(wordView);
        }
    }
}
