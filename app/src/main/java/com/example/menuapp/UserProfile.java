package com.example.menuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



public class UserProfile extends AppCompatActivity {


    private EditText hobbyInput;
    private Button generateButton;
    private TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        hobbyInput = findViewById(R.id.txtHob);
        generateButton = findViewById(R.id.buttonAdd);
        resultText = findViewById(R.id.VisText);


        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setVisibility(View.VISIBLE);
                String hobby = hobbyInput.getText().toString().trim();


                resultText.setText(hobby);


            }
        });
    }


}