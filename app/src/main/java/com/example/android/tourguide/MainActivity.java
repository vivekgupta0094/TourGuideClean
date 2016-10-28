package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView gardenAndParks = (TextView) findViewById(R.id.garden_and_parks);
        gardenAndParks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gardenAndParksIntent = new Intent(MainActivity.this, GardenAndParksActivity.class);
                startActivity(gardenAndParksIntent);
            }
        });

        TextView landmarks = (TextView) findViewById(R.id.landmarks);
        landmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent landmarksIntent = new Intent(MainActivity.this, LandmarksActivity.class);
                startActivity(landmarksIntent);
            }
        });

        TextView nature = (TextView) findViewById(R.id.nature);
        nature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);
                startActivity(natureIntent);
            }
        });

        TextView waterfalls = (TextView) findViewById(R.id.waterfalls);
        waterfalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent waterfallsIntent = new Intent(MainActivity.this, WaterfallsActivity.class);
                startActivity(waterfallsIntent);
            }
        });
    }
}
