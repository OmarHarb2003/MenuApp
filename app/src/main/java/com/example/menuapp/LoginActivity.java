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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlayout);


        name = findViewById(R.id.name);
        pass = findViewById(R.id.pass);
        b = findViewById(R.id.buttonSign);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = name.getText().toString().trim();
                String password = pass.getText().toString().trim();


                if (checkUser(username,password)) {


                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(LoginActivity.this, "login Successfully", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(LoginActivity.this, "login Failed", Toast.LENGTH_LONG).show();

                }

            }
        });
    }

    private Boolean checkUser(String username,String password) {
        UserDA users = new UserDA();


        return users.userNameFound(username,password);



    }
}