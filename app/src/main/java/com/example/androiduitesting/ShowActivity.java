package com.example.androiduitesting;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ShowActivity extends AppCompatActivity {
    private Button backButton;
    private TextView cityNameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityNameView = findViewById(R.id.textView_cityName);
        backButton = findViewById(R.id.button_back);

        // Get the city name from the intent
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("cityName");
        cityNameView.setText(cityName);

        // Sets the City name
        if (cityName == null) {
            cityNameView.setText("No city selected");
        } else {
            cityNameView.setText(cityName);
        }

        backButton.setOnClickListener(v -> {
            finish();
        });
    }
}