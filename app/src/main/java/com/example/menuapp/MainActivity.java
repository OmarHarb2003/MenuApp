package com.example.menuapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button bt;
    private Spinner sp;
    private ImageButton set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=findViewById(R.id.btnGet);
        sp=findViewById(R.id.spnTypes);

        bindSpinner();

        set = findViewById(R.id.Profile);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to User Profile Activity
                Intent intent = new Intent(MainActivity.this, UserProfile.class);
                startActivity(intent);
            }
        });


    }

    private void bindSpinner() {

        DrinkMockupDA da = new DrinkMockupDA();
        String[] arr = da.getDrinkTypes();
        ArrayAdapter<String> spnAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arr);

        sp.setAdapter(spnAdapter);
    }
}