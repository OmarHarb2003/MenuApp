package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spnMenu;
    private Button btnSearch;
    private ListView options;
    private ArrayAdapter<ProteinItems> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnMenu = findViewById(R.id.spnMenu);
        btnSearch = findViewById(R.id.searchBtn);
        options = findViewById(R.id.list_options);

        populateSpinner();

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuItems db = new MenuItems();
                String type = spnMenu.getSelectedItem().toString();
                List<ProteinItems> result = db.getMenuItems(type);

                adapter = new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_list_item_1, result);
                options.setAdapter(adapter);
            }
        });

        options.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ProteinItems selectedItem = (ProteinItems) parent.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra("name", selectedItem.getName());
                intent.putExtra("price", selectedItem.getPrice());
                intent.putExtra("desc", selectedItem.getDesc());
                intent.putExtra("imageId", selectedItem.getImageId());

                startActivity(intent);
            }
        });
    }

    private void populateSpinner() {
        MenuItems db = new MenuItems();
        String[] types = db.getTypes();
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, types);
        spnMenu.setAdapter(spinnerAdapter);
    }
}
