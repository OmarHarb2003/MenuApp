package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class DrinkCat extends AppCompatActivity {
    private Button bt;
    private Spinner sp;
    private ImageButton set;
    private TextView txt;

    private TextView txt2;
    private ListView options;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this,
                android.R.layout.simple_list_item_1,
                Drink.drinks);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(DrinkCat.this,
                        DrinkDetail.class);
                intent.putExtra("drink_id", (int)id);
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }





}
