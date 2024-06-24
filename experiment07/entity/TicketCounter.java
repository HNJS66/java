package com.experiment07.entity;

import com.experiment07.entity.RailwayDepartment;
import com.experiment07.entity.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicketCounter implements Runnable {
    private String name;
    private List<Ticket> soldTickets;
    private RailwayDepartment railwayDepartment;

    public TicketCounter(String name, RailwayDepartment railwayDepartment) {
        this.name = name;
        this.soldTickets = new ArrayList<>();
        this.railwayDepartment = railwayDepartment;
    }

    @Override
    public void run() {
        while (true) {
            Ticket ticket = railwayDepartment.getTicket();
            if (ticket == null) {
                break;
            }
            soldTickets.add(ticket);
            try {
                // 模拟售票过程中的其他业务逻辑操作
                Thread.sleep(new Random().nextInt(50));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " 售出了 " + soldTickets.size() + " 张车票。");
    }
}
