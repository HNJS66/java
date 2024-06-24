package com.experiment03;

public class Employee implements Workable{
    private  String name;
    private double money;
    public Employee(String name, double money){
        this.name = name;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void updateName(String name){
        this.name = name;
    }
    @Override
    public double calculateSalary(){
        return money;
    }
}
