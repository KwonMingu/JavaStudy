package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {
    public static void main(String[] args) {
        //String x; //
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력: ");
        int num = scan.nextInt();
        String result;
        result = num%2  ==0  ?  "짝수" : "홀수" ;
        System.out.println("num : "+ result);



    }
}
