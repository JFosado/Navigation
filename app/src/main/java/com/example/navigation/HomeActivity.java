package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView tvUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUsername = findViewById(R.id.tv_username);
        Bundle parametersReceived=getIntent().getExtras();
        tvUsername.setText(parametersReceived.getString("username"));
    }
}