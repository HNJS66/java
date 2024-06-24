package com.experiment01;

public class LeapYearsTest {
    public static void main(String[] args){
        test(1899,2046);
    }
    public static void test(int StartYear, int EndYear){
        for(int i = StartYear; i <= EndYear; i++){
            if((i % 4 == 0 && i % 100 != 0 )|| i % 400 == 0){
                System.out.println(i);
            }
        }
    }
}
