package com.green.java.ch05;

import java.util.Arrays;

public class  ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};
        int temp=0;


        for (int i = 0; i < numArr.length; i++) {
            int random = (int)(Math.random()*numArr.length);
            temp=numArr[random];
            numArr[random]=numArr[i];
            numArr[i]=temp;
            //System.out.println(Arrays.toString(numArr));


        }

        System.out.println(Arrays.toString(numArr));

    }
}
