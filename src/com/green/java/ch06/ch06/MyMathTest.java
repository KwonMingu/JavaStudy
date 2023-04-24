package com.green.java.ch06.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1=10, n2=22;

        int a1=MyMathStatic.sum(n1,n2);
        System.out.println(a1);


        MyMathInstance m1 = new MyMathInstance();
        int a2=m1.sum(n1, n2);
        System.out.println(a2);




    }
}
