package com.experiment02.entity;


public class Item {
    private Product product;
    private int number;
    public Item(Product product, int number){
        this.product = product;
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
