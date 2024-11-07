package com.example.menuapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    EditText name;
    EditText pass;
    Button b;
    Button b2;


    static UserDA users = new UserDA();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlayout);

        name = findViewById(R.id.name1);
        pass = findViewById(R.id.pass1);
        b= findViewById(R.id.signInBtn1);
        b2= findViewById(R.id.signUpBtn1);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = name.getText().toString().trim();
                String password = pass.getText().toString().trim();


                if (checkUser(username,password)) {


                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);

                    intent.putExtra("myStringKey", username);

                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "login Successfully", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(LoginActivity.this, "login Failed", Toast.LENGTH_LONG).show();

                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent(LoginActivity.this, SignupActivity.class);

                    startActivity(intent);

                }
        });

    }

    private Boolean checkUser(String username,String password) {


        return users.userNameFound(username,password);



    }
}