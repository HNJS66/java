package com.experiment01;

public class SummationTest {
    public static void main(String[] args){
        int repeat = 4;
        int n = 3;
        double n1 = 3;
        test(repeat,n);
        System.out.println("++++++++++++++++++++++++++");
        test1(repeat,n1);
    }
    public static void test(int repeat, double n){
        int sum = 0;
        int x = 0;
        for(int i = 0; i < repeat; i++){
            x+=n;
            n=n*10;
            sum+=x;
        }
        System.out.println(sum);
    }
    public static void test1(int repeat, double n){//Math函数中pow幂函数的使用
        double ans = 0;
        double temp = 0;
        for(int i = 0;i < repeat; i++){
            temp = temp+n*Math.pow(10,i);
            ans += temp;
        }
        System.out.println(ans);
    }
}
