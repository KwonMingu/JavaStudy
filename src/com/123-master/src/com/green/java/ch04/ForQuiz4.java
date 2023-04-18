package com.green.java.ch04;

public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("_");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) { // 1<5 1<4 1<3 1<2 1<1
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }

            }System.out.println("");
        }
    }
}