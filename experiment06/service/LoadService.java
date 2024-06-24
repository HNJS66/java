package com.experiment06.service;

import com.experiment06.entity.Container;
import com.experiment06.entity.Ship;
import com.experiment06.exception.OverWeightException;

import java.util.ArrayList;
import java.util.List;

public class LoadService {
    public static Ship load(Ship ship, List<Container> containers) throws OverWeightException {
        double totalweight = 0;
        for(Container c : containers){
            totalweight = totalweight + c.getWeight();
        }
        if(totalweight > ship.getWeight()){
            throw new OverWeightException(ship.getId(),totalweight - ship.getWeight());
        }
        for(Container c: containers){
            ship.getContainers().add(c);
        }
        return ship;
    }
}
