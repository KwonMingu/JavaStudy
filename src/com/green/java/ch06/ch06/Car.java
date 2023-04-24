package com.green.java.ch06.ch06;

public class Car {
    static String brand; // 클래스 변수(멤버필드)
    String model; // 인스턴스 변수(멤버필드)
    int price;

    static void powerOn() {
        System.out.printf("%s 회사의 차 시동 걸림", brand);

    }
    void printInfo() {
        System.out.printf("brand : %smodel : %s, price : %d\n",brand, model, price);
    }
}
