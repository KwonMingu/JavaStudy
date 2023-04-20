package com.green.java.ch06.ch06;

import java.util.Scanner;




public class FlowEx28Method {

    public static int getRandomNumber(int n1, int n2) {


        int val1 = (int)(Math.random() * (n2-n1 + 1)) + n1;
        return val1;
    }


    public static void main(String[] args) {
        int input , answer;
        answer = getRandomNumber(54,56);
        System.out.println(answer);
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("1~100사이의 정수를 입력");
            input = scan.nextInt();

        } while (input!=answer) ;
        System.out.println("정답");



    }
}
