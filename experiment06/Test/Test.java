package com.experiment06.Test;

import com.experiment06.entity.Container;
import com.experiment06.entity.Ship;
import com.experiment06.exception.OverWeightException;
import com.experiment06.service.LoadService;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static final List<Container> containers = create();

    public static List<Container> create() {
        List<Container> containers = List.of(new Container(001, 50.0), new Container(002, 30.0));
        return containers;
    }

    public static void test1() {

        Ship ship = new Ship(111, "052D",70.0,new ArrayList<>());
        try {
            Ship s = LoadService.load(ship, containers);
            System.out.println("装载成功");
        } catch (OverWeightException e) {
            System.out.println("货船超重 " + e.getMessage());
        }
    }

    public static void test2() {
        Ship ship = new Ship(111, "055",90.0,new ArrayList<>());
        try {
            Ship s = LoadService.load(ship, containers);
            System.out.println("装载成功");
        } catch (OverWeightException e) {
            System.out.println("货船超重 " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        test1();
        //test2();
    }
}
