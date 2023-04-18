package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "권민구";
        System.out.print("나이입력: ");

        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("나의 이름은 " +name + " 나이는 " +num+ "살 입니다.");
    }
}
