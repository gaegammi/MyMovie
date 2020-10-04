package com.example.mymovie.openmoviedb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mymovie.R;

public class DetailActivity extends AppCompatActivity {

    TextView title, director, plot, hashTag;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final Intent intent = getIntent();

        title = findViewById(R.id.dTitle);
        director = findViewById(R.id.dDirector);
        plot = findViewById(R.id.dPlot);
        hashTag = findViewById(R.id.dHashTag);

        String gTitle = intent.getStringExtra("dTitle");
        String gDirector = intent.getStringExtra("dDirectors");
        String gPlot = intent.getStringExtra("dPlot");
        String gHashTag = intent.getStringExtra("dHashTags");

        title.setText(gTitle);
        director.setText(gDirector);
        plot.setText(gPlot);
        hashTag.setText(gHashTag);
    }

}
