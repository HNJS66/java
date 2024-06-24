package com.experiment03;

public class Seller extends Employee{

    private double sale;
    private double sale_commissions;

    public Seller(String name, double money, double sale, double sale_commissions) {
        super(name, money);
        this.sale = sale;
        this.sale_commissions =sale_commissions;
    }
    @Override
    public double calculateSalary(){
        return super.getMoney() + sale * sale_commissions;
    }
}
