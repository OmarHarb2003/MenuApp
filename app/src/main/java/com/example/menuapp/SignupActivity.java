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
    UserDA users = new UserDA();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signuplayout);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = name.getText().toString().trim();
                String password = pass.getText().toString().trim();


                if (checkUser(username,password)) {



                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);

                    users.addUser(username,password);




                    startActivity(intent);
                    Toast.makeText(SignupActivity.this, "Sign Up is Successfull", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(SignupActivity.this, "User already exists", Toast.LENGTH_LONG).show();

                }

            }
        });
    }

    private Boolean checkUser(String username,String password) {
        UserDA users = new UserDA();

        return users.userNameFound(username,password);



    }
}
