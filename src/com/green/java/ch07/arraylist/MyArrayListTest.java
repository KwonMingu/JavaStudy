package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        myList.add(3, 100);


        System.out.println(myList);
    }
}