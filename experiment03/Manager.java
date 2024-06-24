package com.experiment03;

public class Manager extends Employee{
    private double level;

    public Manager(String name, double money, double level) {
        super(name, money);
        this.level = level;
    }

    @Override
    public double calculateSalary(){
        return super.getMoney() * level * 0.8;
    }
}
