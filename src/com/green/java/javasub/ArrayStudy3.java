package com.green.java.javasub;

import java.util.Arrays;

public class ArrayStudy3 {
    public static void main(String[] args) {
        int[] arr = new int[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 10;
            if (arr[i]%2==0) {
                arr[i] = 2*(i+10);
            }
        }
        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arr[i] *= 2;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }

}
