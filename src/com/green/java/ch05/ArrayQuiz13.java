package com.green.java.ch05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr(lottoArr);

        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));

    }

    public static int getRamdomValueFromTo(int sVal, int eVal) {
        return (int) (Math.random() * (eVal - sVal + 1)) + sVal;
    }

    public static void setRandomValuArr(int[] lottoArr) {
        int i = 0;
        Loop:
        while (i < lottoArr.length) {
            int rVal = getRamdomValueFromTo(1, 45);
            int z = 0;
            for (; i < lottoArr.length; z++) {
                if (lottoArr[z] == 0) {
                    break;
                } else if (lottoArr[z] == rVal)
                    continue Loop;
            }
            lottoArr[i++] = rVal;
        }

    }

    public static void sortArr(int[] lottoArr) {
        for (int i = 0; i < lottoArr.length-1; i++) {

            for (int j = i+1; j < lottoArr.length; j++) {

                if (i == lottoArr.length - 1) {
                    break;
                } else if (lottoArr[i] > lottoArr[j]) {
                    int temp = lottoArr[j];
                    lottoArr[j] = lottoArr[i];
                    lottoArr[i] = temp;
                }
            }

        }
        //Arrays.sort(lottoArr);
    }


//    public static void setRandomValuArr(int[] num) {
//        for (int i = 0; i < num.length; i++) {
//            num[i] = (int)(Math.random()*45)+1;
//
//            System.out.println((num[i]));
//
//        }
//    }
}
