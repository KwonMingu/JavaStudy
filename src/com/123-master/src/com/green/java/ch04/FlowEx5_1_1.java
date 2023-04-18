package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5_1_1 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if (score<0 || score>100) {
            System.out.println("점수는 0~100점 사이입니다.");
        } else {


        }



    }
}

