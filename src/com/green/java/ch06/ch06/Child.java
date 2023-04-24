package com.green.java.ch06.ch06;

public class Child extends Parent{
    int age;
    public Child() {}

    void play() {
        System.out.printf("%d살인 아이가 논다\n", age);
    }
    public Child(int age) {
        super();
        System.out.println("Child 기본 생성자");
    }
    public int getSuperAge() {
        return super.age;
    }

    public int getThisAge() {
        return this.age;
    }
}

