package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayList {

    private int[] items;

    public MyArrayList() {
        items = new int[0];
        System.out.println(items.length);
        int asd = 0;
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1];
        temp[items.length] = value;
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];

        }
        items = temp;


    }

    public void add(int idx, int value) {
        if (idx > items.length) {
            return;
        }
        int[] temp = new int[items.length + 1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {
            if (i < idx) {
                temp[i] = items[i];
            } else {
                temp[i + 1] = items[i];
            }
        }
        items = temp;


    }

    @Override
    public String toString() {
        String str = "[";
        if (items.length > 1) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        return str;
    }

    public int size() {
        return items.length;
    }

    public int get(int idx) {
        return items[idx];
    }

    //    public int getNumber(int number) {
//        for (int i = 0; i < idx; i++) {
//        }
//
//    }
    public void bubbleSort() {

        for (int i = items.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }


    }


}




