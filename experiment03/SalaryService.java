package com.experiment03;

public class SalaryService {
    public static double getTotalSalaries(Manager[] manager,Seller[] seller){
        double sumSalary = 0;
        for (Manager manager1 : manager) {
            sumSalary += manager1.calculateSalary();
        }
        for (Seller seller1 : seller) {
            sumSalary += seller1.calculateSalary();
        }
        return sumSalary;
    }
}
