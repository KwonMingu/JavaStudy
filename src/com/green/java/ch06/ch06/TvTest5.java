package com.green.java.ch06.ch06;

public class TvTest5 {

    static String brand;



    public static void main(String[] args) {
        Tv1 tv1 = new Tv1();
        Tv1 tv2 = new Tv1();

        tv1.color ="black";
        tv2.color ="red";

        tv1.brand = "현대";


        System.out.println(tv1.color);
        System.out.println(tv2.color);

    }
}
