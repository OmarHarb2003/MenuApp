package com.example.menuapp;

import java.util.ArrayList;
import java.util.List;

public class MenuItems {
    private List<ProteinItems> items = new ArrayList<ProteinItems>();




    public MenuItems(){

        String bardesc1 = "Delicious chewy protein bars featuring caramel and nuts and coated in chocolate with six grams of protein per serving, along with two grams of sugar, and five grams of net carbs";
        String bardesc2 = "With real cookie crumbles and delicious white chocolate flavored chips, America's favorite flavor can now be your favorite Quest Protein Bar! Keto-friendly.";
        String bardesc3 = "Chocolate peanut butter flavor protein bars are a powerful (and tasty) addition to your recovery regimen. They’ve got 20 grams of plant-based protein containing all the essential amino acids to build and repair muscles and they’re gluten free!";

        items.add(new ProteinItems("Chewy Bars, Caramel Nut",20.0,bardesc1,R.drawable.bar1,"Protein Bar"));
        items.add(new ProteinItems("Protein Bar, Cookies & Cream", 33.48, bardesc2,R.drawable.bar2,"Protein Bar"));
        items.add(new ProteinItems("Chocolate Peanut Butter Flavor Protein Bar", 25.44, bardesc3,R.drawable.bar3,"Protein Bar"));

//-----------------------------------------------------------------------------------------------------------------------------
        String pdesc1 = "32g of protein derived from milk per serving to help rebuild muscles after exercise,Excellent source of Calcium and Vitamins A, C & D";
        String pdesc2 = "MusclePharm Combat Protein Powder is the ultimate choice for athletes who push their limits and expect nothing but the best from their high protein shakes. Each serving of Combat Protein Powder delivers a commanding 25 grams of protein, fueling your muscle to ensure your hard work and dedication yield real results.";
        String pdesc3 = "GOLD STANDARD 100% WHEY™ Protein powder supports muscle and post-workout recovery with 24g of quality protein and 5.5g of naturally occurring BCAAs per serving¹.\n" + "It’s crafted to be a complete, fast-digesting protein with whey protein isolate as the primary source – a filtered form of whey that can support protein goals for people at every level of fitness – from daily runners and gym-goers to competitive strength athletes and everyone in between.";

        items.add(new ProteinItems("MUSCLE MILK GENUINE Protein Powder",40.0,pdesc1,R.drawable.powder1,"Protein Powder"));
        items.add(new ProteinItems("Combat Protein", 42.99, pdesc2,R.drawable.powder2,"Protein Powder"));
        items.add(new ProteinItems("GOLD STANDARD 100% WHEY™", 33.99, pdesc3,R.drawable.powder3,"Protein Powder"));
        //-----------------------------------------------------------------------------------------------------------------------------
        String desc1="No Artificial Preservatives\n" +
                "No Artificial Flavors\n" +
                "No Artificial Colors\n" +
                "Gluten Free\n" +
                "Please Recycle.";

        String desc2="Protein Drink\n" +
                "Gluten free. Muscle milk provides nutrients found in natural milk\n" +
                "High protein. Lactose free\n" +
                "Zero g of sugar\n" +
                "Excellent source of Calcium and Vitamins A,C,& D" +
                "4 grams of fiber per serving\n" +
                "Essential amino acids, including Leaucine, play a role in muscle growth";

        String desc3="Delicious, creamy milk chocolate flavor offers an optimal low-sugar mix of protein and essential vitamins and minerals. That's why it's the drink of chocolate-loving champions.";


        items.add(new ProteinItems("Protein Plus® Chocolate ",2.98,desc1,R.drawable.drink1,"Protein Drink"));
        items.add(new ProteinItems("Muscle Milk Genuine Protein Shake, Chocolate", 25.14,desc2,R.drawable.drink2,"Protein Drink"));
        items.add(new ProteinItems("Milk Chocolate Delight Shake", 8.59, desc3,R.drawable.drink3,"Protein Drink"));


    }

    public List<ProteinItems> getMenuItems(String type){
        List<ProteinItems> result = new ArrayList<>();


        for(ProteinItems m: items){
            if(m.getType().equals(type)){
                result.add(m);
            }
        }
        return result;


    }

    public String[] getTypes(){
        //assume we are reading data from database
        String[] types= {"Protein Bar", "Protein Drink", "Protein Powder"};
        return types;

    }


}


