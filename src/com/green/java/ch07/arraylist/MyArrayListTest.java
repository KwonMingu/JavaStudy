package com.green.java.ch07.arraylist;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        //myList.add(3, 100);
        myList.add(4, 100);

        System.out.println(myList);
        System.out.println(myList.size());
        int v1 = myList.get(4);
        System.out.println(v1);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("---------------------");
        int sum= 0;
        for (int i = 0; i < myList.size(); i++) {

            sum += myList.get(i);

        }System.out.println(sum);


    }
}
