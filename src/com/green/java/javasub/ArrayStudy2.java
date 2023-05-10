package com.green.java.javasub;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {
        String[] strArr =  { "비행기", "기차", "배"};

        //[ 비행기, 기차, 배]

        System.out.print("* ");
        for (int i = 0; i < strArr.length; i++) {
            String a = strArr[i];
            System.out.print(a);
            if(i < strArr.length-1) {
                System.out.print(", ");
            }

        }
        System.out.println(" * ");

        String r = Arrays.toString(strArr).replace("[", "*").replace("]", "*");
        System.out.println(r);



    }




}
