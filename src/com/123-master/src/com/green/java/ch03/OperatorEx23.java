package com.green.java.ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.printf("\"abc\" == \"abc\"? %b\n" , "abc"=="abc" );
        System.out.printf("str1 == str2 ? %b\n", str2==str1 );
        System.out.println(str1.equals(str2)); //문자열 비교는 무조건 equals 사용

        String s4 = new String("aBc");
        System.out.println("str1.equals(s4) :  " + str1.equals(s4));
        System.out.println("str1.equalsIgoreCase(s4) :  " + str1.equalsIgnoreCase(s4));



    }
}
