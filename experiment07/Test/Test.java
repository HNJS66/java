package com.experiment07.Test;

import com.experiment07.entity.RailwayDepartment;
import com.experiment07.entity.TicketCounter;

public class Test {
    public static void main(String[] args) {
        RailwayDepartment railwayDepartment = new RailwayDepartment();

        TicketCounter counter1 = new TicketCounter("售票点1", railwayDepartment);
        TicketCounter counter2 = new TicketCounter("售票点2", railwayDepartment);
        TicketCounter counter3 = new TicketCounter("售票点3", railwayDepartment);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);
        Thread thread3 = new Thread(counter3);

        // 启动三个线程模拟三个售票点同时售票
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
