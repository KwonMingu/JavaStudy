package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        //generic 제네릭
        ArrayList<Integer> list = new ArrayList<>();
        //list.add("11");
        //list.add("11.1");
        //list.add(true);
        list.add(10);
        list.add(13);

        int n1 = list.get(0);
        System.out.println(list);


    }
}
