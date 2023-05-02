package com.green.java.ch04.vendingmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachineObj {
    private int money;
    private List<Drink> list = new ArrayList<>();
    private int num=1;


    public VendingMachineObj() {
        list = new ArrayList<>();
        list.add(new Drink(1000, "콜라", "코카콜라", 500));
        list.add(new Drink(1500, "사이다", "칠성", 450));
        list.add(new Drink(2000, "환타", "코카콜라", 500));

    }

    public void insert(int money) {
        this.money += money;


    }

    public void showMoney() {
        System.out.println("money :" + money);
    }

    public void showMenus() {
        System.out.println("번호 \t 메뉴명 \t 가격 \t 회사\t 용량" );
        for (Drink a : list) {
//            System.out.print(num+++"\t"+"\t");
//            System.out.print(a.getNm()+"\t"+"\t");
//            System.out.print(a.getPrice()+"원"+"\t");
//            System.out.print(a.getCompany()+"\t"+"\t");
//            System.out.print(a.getMl()+"ml"+"\t"+"\t");
            System.out.printf("%d. \t %s \t %,d원 \t %s \t %,dml"
            ,num++,a.getNm(), a.getPrice(), a.getCompany(), a.getMl());
            System.out.println("");
        }
    }
    public void purchaseDrink(int val) {
            Drink d = list.get(val-1);
        System.out.printf("%s을 구매하였습니다.\n"  ,d.getNm() );
        money -= d.getPrice();

        }
    }

