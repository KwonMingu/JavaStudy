package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000)/1000.0;
        System.out.println(shortPi);

        System.out.println(Math.round(315.4)); //반올림  long타입
        System.out.println(Math.ceil(315.4));   // 올림 실수값
        System.out.println(Math.floor(315.4));  // 내림 실수값
    }
}
