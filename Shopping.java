package com.example.android.todolists;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        
        ArrayList<String> shopping = new ArrayList<String>();
        
        shopping.add("Pizza");
        shopping.add("Oven chips");
        shopping.add("Whole milk");
        shopping.add("Roast chicken");
        shopping.add("Eggs");
        shopping.add("Bacon");
        shopping.add("Sausages");
        shopping.add("Potato waffles");
        shopping.add("Steak");
        shopping.add("Ice cream");
        shopping.add("Onions");
        shopping.add("Carrots");
        shopping.add("Lettuce");
        shopping.add("Sweet potatoes");
        shopping.add("Parsnips");
        shopping.add("Celery");
        shopping.add("Butternut squash");
        shopping.add("Fruit juice");
        shopping.add("Cereal");
        shopping.add("Yoghurt");
        shopping.add("Chocolate");
        shopping.add("Beer");

        for (int index = 0; index <shopping.size(); index++) {
            LinearLayout rootView = (LinearLayout) findViewById(R.id.shoppingview);
            TextView wordView = new TextView(this);
            wordView.setText(shopping.get(index));
            rootView.addView(wordView);
        }
    }
}
