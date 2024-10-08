package com.example.menuapp;

import java.util.ArrayList;
import java.util.List;

public class DrinkMockupDA {



    private List<Drink> drinks ;




    public DrinkMockupDA(){

        drinks = new ArrayList<>();
        drinks.add(new Drink("Black Coffe",5.0,"Hot Drinks"));
        drinks.add(new Drink("Latte",7.0,"Hot Drinks"));
        drinks.add(new Drink("Sprite",4.0,"Cold Drinks"));
        drinks.add(new Drink("Ice Coffe",8.0,"Cold Drinks"));
        drinks.add(new Drink("Chicken Sandwich",15.0,"Sandwiches"));
        drinks.add(new Drink("Beef Sandwiches",18.0,"Sandwiches"));





    }
    public String[] getDrinkTypes(){
        String[] types = {"Hot Drinks","Cold Drinks","Sandwiches"};
        return types;



    }

    public List<Drink> getDrinksByType(String drinkType){

        List<Drink> result = new ArrayList<>();

        for(Drink d:drinks){
            if (d.getType().equals(drinkType)){
                result.add(d);
            }
        }


        return  result;

    }


}
