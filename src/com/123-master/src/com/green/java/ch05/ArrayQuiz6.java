package com.green.java.ch05;

public class ArrayQuiz6 {
    public static void main(String[] args) {
        int [] numArr = {11, 14, 2, 7, 36, 35};
        int [] copyArr = new int[numArr.length];

        for (int i = 0; i < numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(copyArr[i]);
        }

        numArr[0]=101;
        System.out.println("=============");
        System.out.println(copyArr[0]);
        System.out.println(numArr[0]);




    }
}
