package com.green.java.javasub;

import java.util.Arrays;

public class ArrayStudy5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr2 = new int[10];

        int n = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n++;
        }

        changeArrEvenMulti(arr, 3);
        changeArrEvenMulti(arr2, 3);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }


    public static void changeArrEvenMulti(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+10;
            if (arr[i]%2==0) {
                arr[i] = (i+10)*num;
            }
        }
    }


}

