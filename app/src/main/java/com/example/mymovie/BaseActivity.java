package com.example.mymovie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mymovie.festival.FestivalActivity;
import com.example.mymovie.openmoviedb.MainActivity;

public class BaseActivity extends AppCompatActivity {

    Button openApiBtn;
    Button jsoupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_list);

        openApiBtn = findViewById(R.id.openApiBtn);
        jsoupBtn = findViewById(R.id.jSoupBtn);

        openApiBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(BaseActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        jsoupBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(BaseActivity.this, FestivalActivity.class);
                startActivity(intent2);
            }
        });




    }
}
