package com.experiment07.entity;

import com.experiment07.entity.Ticket;

import java.util.ArrayList;
import java.util.List;

public class RailwayDepartment {
    private List<Ticket> tickets;

    public RailwayDepartment() {
        tickets = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            tickets.add(new Ticket(i, "Harbin", "Beijing"));
        }
    }

    // 获取车票的方法，使用 synchronized 关键字保证线程安全
    public synchronized Ticket getTicket() {
        if (tickets.isEmpty()) {
            return null;
        }
        return tickets.remove(0);
    }
}
