package com.green.java.ch06.ch06;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.sum(10, 20);
        mm.sum(30, 20);
        mm.sum(100, 20);

        int result = mm.sum2(10, 245);
        System.out.println("result :"+ result);

    }
}
