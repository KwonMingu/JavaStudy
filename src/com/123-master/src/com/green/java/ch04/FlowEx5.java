package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if (score >= 90) {

            if (score >= 98) {
                System.out.println(score+"점 의 학점은 A+입니다.");
            } else if (score<94) {
                System.out.println(score+"점 의 학점은 A-입니다.");

            } else {
                System.out.println(score+"점 의 학점은 A입니다.");
            }
        } else if (score >= 80) {
            if (score >= 88) {
                System.out.println(score+"점 의 학점은 B+입니다.");
            } else if (score<84) {
                System.out.println(score+"점 의 학점은 B-입니다.");

            } else {
                System.out.println(score+"점 의 학점은 B입니다.");
            }
        } else if (score >= 70) {
            if (score >= 78) {
                System.out.println(score+"점 의 학점은 C+입니다.");
            } else if (score<74) {
                System.out.println(score+"점 의 학점은 C-입니다.");

            } else {
                System.out.println(score+"점 의 학점은 C입니다.");
            }
        } else {
            System.out.println(score+"점 의 학점은 D입니다.");
            }
        }


    }

