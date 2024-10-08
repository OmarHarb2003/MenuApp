package com.example.menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.btnGet);
        sp = findViewById(R.id.spnTypes);
        txt = findViewById(R.id.textView2);
        txt2 = findViewById(R.id.txtList);


        Intent intent = getIntent();
        String name = intent.getStringExtra("myStringKey");

        txt.setText("Welcome " + name + "!");

        bindSpinner();

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected drink type
                String selectedType = sp.getSelectedItem().toString();

                // Create an instance of DrinkMockupDA to fetch drinks
                DrinkMockupDA drinkMockupDA = new DrinkMockupDA();
                List<Drink> drinks = drinkMockupDA.getDrinksByType(selectedType);

                // Display the drinks in the TextView
                if (drinks.isEmpty()) {
                    txt2.setText("No " + selectedType+ " available for.");
                } else {
                    StringBuilder drinkNames = new StringBuilder("Available " +selectedType+":\n");
                    for (Drink drink : drinks) {
                        drinkNames.append(drink.getName())
                                .append(" - $")
                                .append(drink.getPrice())
                                .append("\n");
                    }
                    txt2.setText(drinkNames.toString());
                }
            }
        });

        set = findViewById(R.id.Profile);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to User Profile Activity
                Intent intent = new Intent(MainActivity.this, UserProfile.class);
                startActivity(intent);
            }
        });
    }

    private void bindSpinner() {
        DrinkMockupDA da = new DrinkMockupDA();
        String[] arr = da.getDrinkTypes();
        ArrayAdapter<String> spnAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arr);
        spnAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(spnAdapter);
    }
}
