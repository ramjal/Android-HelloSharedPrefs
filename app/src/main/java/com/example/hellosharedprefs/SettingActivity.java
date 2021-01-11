package com.example.hellosharedprefs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class SettingActivity extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private String sharedPrefFile = "com.example.hellosharedprefs";
    private Spinner spinnerColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        spinnerColor = findViewById(R.id.spinner);
        spinnerColor.setAdapter(new SpinnerAdapter(this));
    }

    public void reset(View view) {
    }

    public void save(View view) {
    }
}