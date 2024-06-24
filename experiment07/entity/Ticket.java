package com.experiment07.entity;

public class Ticket {
    private int ID;
    private String startStation;
    private String endStation;

    public Ticket(int ID, String startStation, String endStation) {
        this.ID = ID;
        this.startStation = startStation;
        this.endStation = endStation;
    }

    public int getID() {
        return ID;
    }

    public String getStartStation() {
        return startStation;
    }

    public String getEndStation() {
        return endStation;
    }
}
