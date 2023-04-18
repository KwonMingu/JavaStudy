package com.green.java.ch05;

public class ArrayQuiz11 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        double avg=0;
        for (int i = 0; i < numArr.length; i++) {
            //double b = numArr.length;
            avg += numArr[i];


        }
        avg /= numArr.length;

        System.out.printf("avg: %.2f\n" , avg);

    }
}
