package com.green.java.ch04;

import com.green.java.ch02.CastingEx1;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("(1) squre");
            System.out.println("(2) squre root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)를 선택하세요.");

            String temp = scan.nextLine();
            num=Integer.parseInt(temp);


            if(num==0) {
                break;
            } else if ( 0<num && num<=3 ) {
                num=num;
            } else {
                System.out.println("메뉴를 잘못 선택하셨습니다.");
            }
            System.out.println("선택하신 메뉴는 "+ num+ "번 입니다. ");

        }

    }
}
