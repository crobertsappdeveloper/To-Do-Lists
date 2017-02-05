package com.example.android.todolists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        ArrayList<String> workout = new ArrayList<String>();

        workout.add("Barbell benchpress");
        workout.add("Dumbbell incline benchpress");
        workout.add("Barbell deadlifts");
        workout.add("Barbell squats");
        workout.add("Dumbbell lunges");
        workout.add("Crunches");
        workout.add("Dumbbell pullovers");
        workout.add("Barbell rows");
        workout.add("Dumbbell alternate biceps curls");
        workout.add("Dumbbell wrist curls");
        workout.add("Barbell overhead presses");
        workout.add("Seated dumbbell presses");
        workout.add("Barbell goodmornings");
        workout.add("Barbell hip thrusts");
        workout.add("Leg raises");
        workout.add("Twisting sittups");
        workout.add("Kettlebell swings");
        workout.add("Dumbbell hammer curls");
        workout.add("Barbell reverse curls");
        workout.add("Dumbbell flies");
        workout.add("Dumbbell reverse flies");
        workout.add("Dumbbell triceps extensions");
        workout.add("Dumbbell triceps kickbacks");
        workout.add("Barbell front squats");
        workout.add("Barbell hack squats");
        workout.add("Barbell box squats");
        workout.add("Barbell walking lunges");
        workout.add("Skipping");
        workout.add("Jogging");

        for (int index = 0; index < workout.size(); index++) {
            LinearLayout rootView = (LinearLayout) findViewById(R.id.workoutview);
            TextView wordView = new TextView(this);
            wordView.setText(workout.get(index));
            rootView.addView(wordView);
        }
    }
}
