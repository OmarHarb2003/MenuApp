package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descreption);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("imageId");
        String name = intent.getStringExtra("name");
        double price = intent.getDoubleExtra("price", 0);
        String desc = intent.getStringExtra("desc");

        ImageView image = (ImageView)findViewById(R.id.image);
        image.setImageResource(id);

        TextView txtName= (TextView)findViewById(R.id.txtName);
        TextView txtPrice= (TextView)findViewById(R.id.txtPrice);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);


        txtName.setText(name);
        txtPrice.setText("Price: $"+price);
        txtDesc.setText(desc);





    }
}