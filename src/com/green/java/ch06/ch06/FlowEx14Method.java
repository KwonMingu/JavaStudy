package com.green.java.ch06.ch06;

public class FlowEx14Method {
    public static void main(String[] args) {
        printAllSum(1,100);

    }


    public static void printAllSum(int min, int max) {
        int sum =0;
        for (int i = min; i <max+1 ; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
