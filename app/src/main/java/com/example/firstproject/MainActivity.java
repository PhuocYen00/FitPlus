package com.example.firstproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView welcomeText, lastLoginText, stepsCount, caloriesBurned;
    private Button trackActivityBtn, logMealBtn;
    private RecyclerView activitiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        setupClickListeners();
        loadUserData();
        loadActivitiesList();
    }

    private void initializeViews() {
        profileImage = findViewById(R.id.profileImage);
        welcomeText = findViewById(R.id.welcomeText);
        lastLoginText = findViewById(R.id.lastLoginText);
        stepsCount = findViewById(R.id.stepsCount);
        caloriesBurned = findViewById(R.id.caloriesBurned);
        trackActivityBtn = findViewById(R.id.trackActivityBtn);
        logMealBtn = findViewById(R.id.logMealBtn);
        activitiesList = findViewById(R.id.activitiesList);
    }

    private void setupClickListeners() {
        trackActivityBtn.setOnClickListener(v -> {
            // TODO: Implement activity tracking functionality
            Toast.makeText(this, "Track Activity clicked", Toast.LENGTH_SHORT).show();
        });

        logMealBtn.setOnClickListener(v -> {
            // TODO: Implement meal logging functionality
            Toast.makeText(this, "Log Meal clicked", Toast.LENGTH_SHORT).show();
        });
    }

    private void loadUserData() {
        // TODO: Load actual user data from a database or shared preferences
        welcomeText.setText("Welcome back, John!");
        lastLoginText.setText("Last login: Today, 9:00 AM");
        stepsCount.setText("Steps: 5,000");
        caloriesBurned.setText("Calories: 250");
    }

    private void loadActivitiesList() {
        List<String> activities = new ArrayList<>();
        activities.add("Morning Run - 30 minutes");
        activities.add("Breakfast - 400 calories");
        activities.add("Upcoming: Yoga class at 2 PM");

        ActivitiesAdapter adapter = new ActivitiesAdapter(activities);
        activitiesList.setLayoutManager(new LinearLayoutManager(this));
        activitiesList.setAdapter(adapter);
    }
}

