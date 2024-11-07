package com.example.menuapp;

public class ProteinItems {






    private String name;
    private double price;
    private String desc;
    private int imageId;
   private  String type;

    public ProteinItems(String name, double price,String desc, int imageId,String type) {
        this.name = name;
        this.price = price;
        this.desc= desc;
        this.imageId = imageId;
        this.type=type;
    }

    public ProteinItems(){}


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


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



    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return  name +"";

    }
}
