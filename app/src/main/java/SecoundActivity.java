package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecoundActivity extends AppCompatActivity {

    Button back;
    EditText namn;
    SharedPreferences preferences;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secound_activity);

        namn = findViewById(R.id.edit_text);
        button = findViewById(R.id.save);
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name", namn.getText().toString());
                editor.apply();
            }
        });
    }
}