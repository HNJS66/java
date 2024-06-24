package com.experiment06.entity;

public class Container {
    private Integer id;
    private Double weight;
    public Container(Integer id, Double weight){
        this.id = id;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
