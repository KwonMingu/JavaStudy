package com.green.java.ch06.ch06;

public class ChildTest {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.play();
        ch.age = 10;

        System.out.println(ch.age);
        ch.play();

        GrandChild gc = new GrandChild();
        gc.age = 28;
        gc.play();
    }
}
