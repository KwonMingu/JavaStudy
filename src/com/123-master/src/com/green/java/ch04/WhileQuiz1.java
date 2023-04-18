package com.green.java.ch04;

import java.util.Scanner;

public class WhileQuiz1 {
    public static void main(String[] args) {
        int input = 0, answer =0;
        answer = (int)(Math.random()*100)+1;
        System.out.println(answer);
        Scanner scan = new Scanner(System.in);

        while (input!=answer) {

            String temp = scan.nextLine();
            input=Integer.parseInt(temp);
            System.out.println("1~100사이의 정수를 입력");

            if (input>answer) {
                System.out.println("down");
            } else if (input<answer) {
                System.out.println("up");
            }
        }
        if (input==answer) {
            System.out.println("정답");
        }

    }
}
