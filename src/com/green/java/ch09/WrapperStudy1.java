package com.green.java.ch09;

public class WrapperStudy1 {
    public static void main(String[] args) {

        Integer i1 = 10;
        int i2 = 10;

        String s1 = Integer.toString(i2);
        String s2 = i1.toString();

        System.out.println(i1==i2);

        Character c1 = 'c';
        Float f1 = 10.1f;

    }

}
