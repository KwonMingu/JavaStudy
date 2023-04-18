package com.green.java.ch02;

public class CastingEx2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        double n3 = (double) n1;
        double n4 = (double) n2;

        System.out.println( n1/n2);
        //System.out.println((double) n1/n2);
        System.out.println(n3/n4);
    }
}
