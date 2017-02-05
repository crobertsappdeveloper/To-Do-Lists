package com.example.android.todolists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Set the content of the activity to use the activity_main.xml layout file */
        setContentView(R.layout.activity_main);

        /* Find the View that shows the Shopping category and assign it to shoppingPress */
        TextView shoppingPress = (TextView) findViewById(R.id.shoppinglist);

        /* Set a click listener on that View with the previously assigned shoppingPress */
        shoppingPress.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                /* The code below runs when Shopping is pressed on */
                Intent shoppingIntent = new Intent(MainActivity.this, Shopping.class);
                startActivity(shoppingIntent);
            }
        });

        TextView houseworkPress = (TextView) findViewById(R.id.houseworklist);

        houseworkPress.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent houseworkIntent = new Intent(MainActivity.this, Housework.class);
                startActivity(houseworkIntent);
            }
        });

                TextView gardeningPress = (TextView) findViewById(R.id.gardeninglist);

        gardeningPress.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colours View is clicked on.
            @Override
            public void onClick(View view) {
                Intent gardeningIntent = new Intent(MainActivity.this, Gardening.class);
                startActivity(gardeningIntent);
            }
        });

        TextView cookingPress = (TextView) findViewById(R.id.cookinglist);

        cookingPress.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent cookingIntent = new Intent(MainActivity.this, Cooking.class);
                startActivity(cookingIntent);
            }
        });

        TextView workoutPress = (TextView) findViewById(R.id.workoutlist);

        workoutPress.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent workoutIntent = new Intent(MainActivity.this, Workout.class);
                startActivity(workoutIntent);
            }
        });

    }

}
