package com.experiment02.entity;

public class User {
    private String name;
    private double money;
    private String Address;
    public User(String name, double money, String Address){
        this.name = name;
        this.Address = Address;
        this.money = money;
    }

    public String getAdress() {
        return Address;
    }

    public void setAdress(String adress) {
        Address = adress;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
