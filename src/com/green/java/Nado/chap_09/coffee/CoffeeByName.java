package com.green.java.Nado.chap_09.coffee;

import java.sql.SQLOutput;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 :" + name);
    }
}
