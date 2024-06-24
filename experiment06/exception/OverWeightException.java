package com.experiment06.exception;

import java.util.SplittableRandom;

public class OverWeightException extends Exception{
    private int shipId;
    private double overweight;
    public OverWeightException(int shipId,double overweight){
        this.shipId = shipId;
        this.overweight = overweight;
    }
    public String getMessage(){
        return "Ship ID: " + shipId +", Overweight: " + overweight;
    }
}

