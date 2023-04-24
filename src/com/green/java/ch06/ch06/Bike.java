package com.green.java.ch06.ch06;

public class Bike {
    String brand; // 클래스 변수(멤버필드)
    String model; // 인스턴스 변수(멤버필드)
    int price;


    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Bike() {

    }

    public Bike(String  model) {
        this.model = model;
    }


    void drive() {
        System.out.printf("%s 브랜드 %s 모델이 달린다.", brand, model);

    }
}
