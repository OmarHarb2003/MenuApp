package com.example.menuapp;

public class Drink {



    private String name;


    private double price;
    private String desc;
    private int imageId;

    public static final Drink[] drinks ={

            new Drink("Black Coffe",5.0,"a black coffee",R.drawable.coffee)

    };

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Drink(String name, double price,String desc, int imageId) {
        this.name = name;
        this.price = price;
        this.desc= desc;
        this.imageId = imageId;
    }

    public Drink(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int ImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "desc='" + desc + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
    public String toString(){
        return name +", "+ price;
    }
}
