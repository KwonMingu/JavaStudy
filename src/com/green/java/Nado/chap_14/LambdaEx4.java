package com.green.java.Nado.chap_14;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        list.removeIf(item -> item % 2 ==0 || item % 3 == 0);
        list.forEach(item -> System.out.print(item + ", "));

        list.replaceAll(item -> item*10);
        list.forEach(item -> System.out.println(item +", "));
        System.out.println();


    }

}
