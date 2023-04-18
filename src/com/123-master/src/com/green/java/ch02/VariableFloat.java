package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        float f1 = 10; // 리터럴 기본타입 = 더블타입
        System.out.println(f1);

        f1 = (float)9.77;
        f1 = 9.77f;

        System.out.println(f1);

        long l1 = 100;
        float f2 = l1;
        System.out.println(f2);

        double d1 = 9.77d;
        double d2 = 9.77D;

    }
}
