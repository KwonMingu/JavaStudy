package com.green.java.ch04.vendingmachine;


import java.util.LinkedList;

public class VendingMachine {

    private LinkedList<Integer> purchaseList = new LinkedList<>();
    private int money;
    private String[] menuNameArr = {"콜라", "사이다", "환타", "미란다"};
    private int[] menuPriceArr = {1000, 1500, 2000, 2500};


    public void insert(int money) {
        this.money += money;

    }

    public void showMoney() {
        System.out.printf("현재 잔액은 %,d 원입니다.\n", this.money);
    }

    public void showMenus() {
        System.out.println("번호\t 메뉴명 \t 가격 ");
        for (int i = 0; i < menuNameArr.length; i++) {
            System.out.printf("%d. \t %s \t %,d원 \n",
                    i+1,menuNameArr[i],menuPriceArr[i]);
        }
    }
    public void purchaseDrink(int idx) {

        //System.out.println(menuNameArr[idx-1]+"를 구매하였습니다.");
        money -= menuPriceArr[idx-1];
        purchaseList.add(idx-1);
    }

    public void showPurchaseList() {
        if(purchaseList.size()==0) {
            System.out.println("제품을 구매하지 않았습니다.");
            return;
        }
        if (purchaseList.size()>0){
            int idx = purchaseList.get(0);
            System.out.printf("%s ",menuNameArr[idx]);
            for (int i = 1; i < purchaseList.size(); i++) {
                idx = purchaseList.get(i);
                System.out.printf(", %s ",menuNameArr[idx]);

            }
        }


        System.out.println("구매완료");


        }

    }


