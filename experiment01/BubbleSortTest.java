package com.experiment01;

import java.util.Arrays;
public class BubbleSortTest {
    public static void main(String[] args){
        sort();
        System.out.println("++++++++++++++++++++++++++++");
        sort1();
        System.out.println("++++++++++++++++++++++++++++");
        sort2();
    }
    public static void sort(){//置换大的到最后
        int[] arr = {8,4,3,1,25,10};
        for(int i = 0; i < arr.length-1; i++){//一共执行长度减一次
            for(int j = 0; j <= arr.length-i-2 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        /*for(int k = 0; k <= arr.length-1; k++){
            System.out.println(arr[k]);
        }*/
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void sort1(){//置换小的到最前
        int[] arr = {8,5,6,3,1,10};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = arr.length-1; j > i; j--){
                if(arr[j] < arr[j-1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void sort2() {//集合流排序封装
        int[] arr = {5, 9, 6, 2, 3, 26};
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);
    }
}
