package com.green.java.ch02;

public class VariableNumber {
    public static void main(String[] args) {

        byte b1;
        short s1;
        long l1;
        int n1; // int는 변수타입 n1는 변수명 (변수선언은 1번만)
        n1 = 10;  // 대입연산자, 오른쪽값 복사하여 왼쪽 주입

        System.out.println(n1);
        n1=20; // 20 = 리터럴, 처음 값을 넣을 떄 초기화 ,
        System.out.println(n1);
    }
}
