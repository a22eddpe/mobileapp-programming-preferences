package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button tillbaks;
    EditText namn;
    SharedPreferences preferences;
    Button knapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        namn = findViewById(R.id.editText);
        knapp = findViewById(R.id.knappSpara);
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);
        tillbaks = findViewById(R.id.knappTillbaka);
        tillbaks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        knapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name", namn.getText().toString());
                editor.apply();
                finish();
            }
        });
    }
}