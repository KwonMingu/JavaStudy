package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0");

        while (flag) {

            String temp = scan.nextLine();
            num=Integer.parseInt(temp);
            if (num!=0) {
                sum += num;

            } else {
                flag = false;
            }

        }
        System.out.println("합계:"+sum);
    }
}
