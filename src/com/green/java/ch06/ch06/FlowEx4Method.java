package com.green.java.ch06.ch06;

import java.util.Scanner;


class ScoreObj {
    char getGrade(int score) {
        char grade = 'D';
        if (score >= 90) {
            grade = 'A';

        } else if (score >= 80) {
            grade = 'B';

        } else if (score >= 70) {
            grade = 'C';
        }
        return grade;

    }
}
public class FlowEx4Method {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요 >");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        ScoreObj so = new ScoreObj();
        grade = so.getGrade(score);



        if (score >= 90) {
            grade = 'A';

        } else if (score >= 80) {
            grade = 'B';

        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println(score+"점의 학점은"+grade+"입니다.");
    }
}
