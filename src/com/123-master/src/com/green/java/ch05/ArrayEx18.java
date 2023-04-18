package com.green.java.ch05;

import java.util.Arrays;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("score" + "[" + i + "][" + 0 + "] =" + score[i][0]);
            for (int j = 1; j < score[i].length; j++) {
                System.out.println("score" + "[" + i + "][" + j + "] =" + score[i][j]);
            }

        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                sum += score[i][j];

            }

        }

        System.out.println(sum);

    }
}