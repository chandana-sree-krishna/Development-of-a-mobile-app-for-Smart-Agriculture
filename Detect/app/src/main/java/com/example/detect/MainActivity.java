package com.example.detect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button diseaseButton = findViewById(R.id.diseaseButton);
        diseaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clickDiseaseIntent = new Intent(MainActivity.this, Diseases.class);
                startActivity(clickDiseaseIntent);
            }
        });

    }
}
