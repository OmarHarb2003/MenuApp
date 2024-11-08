package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DrinkDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descreption);

        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("drink_id");

        Drink drink = Drink.drinks[id];

        ImageView image = (ImageView)findViewById(R.id.coffee_image);
        image.setImageResource(drink.ImageId());

        TextView txtName= (TextView)findViewById(R.id.txtName);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);

        txtName.setText(drink.getName());
        txtDesc.setText(drink.getDesc());

    }
}