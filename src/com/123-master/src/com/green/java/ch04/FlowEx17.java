package com.green.java.ch04;

public class FlowEx17 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}