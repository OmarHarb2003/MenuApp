package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    EditText name;
    EditText pass;
    Button b;
    UserDA users = LoginActivity.users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuplayout);

        name = findViewById(R.id.name1);
        pass = findViewById(R.id.pass1);
        b = findViewById(R.id.signUpBtn2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString().trim();
                String password = pass.getText().toString().trim();

                if (!users.usernameExists(username)) {
                    users.addUser(username, password);
                    Toast.makeText(SignupActivity.this, "Sign Up is Successful", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(SignupActivity.this, "User already exists", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
