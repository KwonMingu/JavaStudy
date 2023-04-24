package com.green.java.ch06.ch06;

public class Tv1 {
    String color;
    boolean power;
    int channel;

    static String brand;

    void power() {power=!power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}

}
