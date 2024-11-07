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

public class MainActivity extends AppCompatActivity {
    private Button bt;
    private Spinner sp;
    private ImageButton set;
    private TextView txt;

    private TextView txt2;
    private ListView options;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        if (position==0){

            Intent intent = new Intent(MainActivity.this, DrinkCat.class);

            startActivity(intent);

        }
    }
};
            options = findViewById(R.id.list_options);








        options.setOnItemClickListener(itemClickListener);




    }


}
