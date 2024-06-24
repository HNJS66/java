package com.experiment06.entity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ship {
    private Integer id;
    private String name;
    private Double weight;
    private List<Container> containers;
    public Ship(Integer id, String name, Double weight, List<Container> containers){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.containers = containers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }
}
