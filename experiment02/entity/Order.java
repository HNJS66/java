package com.experiment02.entity;


import java.util.List;

public class Order {
    private User user;
    private List<Item> item;
    private double price;
    public Order(User user, List<Item> item, double price){
        this.price = price;
        this.item = item;
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
