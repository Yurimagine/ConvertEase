package com.example.unitconversion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {

    Button btnLength, btnWeight, btnTemperature, btnVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen); // ✅ correct layout name

        // Find buttons
        btnLength = findViewById(R.id.btnLength);
        btnWeight = findViewById(R.id.btnWeight);
        btnTemperature = findViewById(R.id.btnTemperature);
        btnVolume = findViewById(R.id.btnVolume);

        // Set listeners
        btnLength.setOnClickListener(v -> openConverter("Length"));
        btnWeight.setOnClickListener(v -> openConverter("Weight"));
        btnTemperature.setOnClickListener(v -> openConverter("Temperature"));
        btnVolume.setOnClickListener(v -> openConverter("Volume"));
    }

    private void openConverter(String category) {
        Intent intent = new Intent(HomeScreen.this, MainActivity.class);
        intent.putExtra("CATEGORY", category);
        startActivity(intent);
    }
}