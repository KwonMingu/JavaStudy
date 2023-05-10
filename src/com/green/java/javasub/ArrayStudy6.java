package com.green.java.javasub;

import java.util.Arrays;

public class ArrayStudy6 {
    public static void main(String[] args) {


        int[] arr = getRandomArr(6, 1, 20);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = getRandomNoDuplicatedArr(6, 1, 45);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] getRandomArr(int length, int min, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return arr;
    }

    public static int[] getRandomNoDuplicatedArr(int len, int min, int max) {
        int[] arr = new int[len];
        Loop:
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1)) + min;
            for (int j = 0; j < i; j++) {
                if (arr[i]==arr[j]) {
                    i--;
                    break;
                }
            }

        }
        return arr;
    }
}