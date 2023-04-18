package com.green.java.ch05;

import javax.naming.NameNotFoundException;

public class ArrayQuiz2 {
    public static void main(String[] args) {
        int[] rNumArr = new int[6];
        int answer;

        answer = (int)(Math.random()*45)+1;
        //System.out.println(answer);

        for (int i = 0; i < rNumArr.length; i++) {
            answer = (int)(Math.random()*45)+1;
            rNumArr [i] = answer;

        }
        for (int i = 0; i < rNumArr.length; i++) {
            System.out.println(rNumArr[i]);
        }

    }
}
