package com.green.java.ch02;

public class VariableNumber2 {
    public static void main(String[] args) {

        // literal 값 그자체
        byte b1 = 127;
        System.out.println(b1);

        int i1 = 128;
        int i2 = b1;
        b1 = (byte)i1;
        System.out.println(b1);
        b1 = (byte)-129;
        System.out.println(b1);
    }
}
