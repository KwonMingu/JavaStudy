package com.green.java.ch06.ch06;


public class FlowEx18Method {

    public static void gugudan(int u) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d*%d = %d\n", u,i,u*i);
        }
        System.out.println("");
    }


    public static void gugudan(int s, int q) {
        for (int i = s; i <= q; i++) {
            gugudan(i);
        }
    }
        public static void main (String[]args){
            gugudan(2);
            gugudan(5, 7);


        }
    }
