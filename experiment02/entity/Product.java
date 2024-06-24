package com.experiment02.entity;

public class Product {
    private String name;
    private double price;
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
