package com.example.musicalbaaza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView holly = (ImageView) findViewById(R.id.hollywood_image);
        ImageView kolly = (ImageView) findViewById(R.id.kollywood_image);

        holly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hollywoodIntent = new Intent(MainActivity.this,HollywoodActivity.class);
                startActivity(hollywoodIntent);
            }
        });

        kolly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kollywoodIntent = new Intent(MainActivity.this,BollywoodActivity.class);
                startActivity(kollywoodIntent);
            }
        });

    }
}
