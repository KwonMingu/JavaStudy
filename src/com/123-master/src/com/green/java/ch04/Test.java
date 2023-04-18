package com.green.java.ch04;

public class Test {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 - i; j++) {
                System.out.print("_");
            }
            for (int z = 0; z < 2*i + 1; z++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1+i; j++) {
                System.out.print("_");
            }
            for (int j = 4; j > 2*i-1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}