package com.experiment03;

public class test {
    public static void main(String[] arg){
        Manager[] managers = new Manager[1];
        Manager manager1 = new Manager("小明",5000,2);
        managers[0] = manager1;
        Seller[] sellers = new Seller[1];
        Seller seller1 = new Seller("小红",3000,20000,0.15);
        sellers[0] = seller1;
        double sumSalary = SalaryService.getTotalSalaries(managers , sellers);
        System.out.println(sumSalary);
    }
}
