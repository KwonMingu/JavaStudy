package com.green.java.ch06.ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv1 tv1 = new Tv1(); //tv타입의 주소값만 담을수잇는 reference 변수

        System.out.printf("power : %b\n", tv1.power);
        System.out.printf("channel : %d\n", tv1.channel);

        tv1.power = true;
        System.out.printf("power : %b\n", tv1.power);
        tv1.power();
        System.out.printf("power : %b\n", tv1.power);

        tv1.channelUp();
        tv1.channelUp();
        System.out.printf("channel : %d\n", tv1.channel);
        tv1.channel=10;
        System.out.printf("channel : %d\n", tv1.channel);

    }
}
