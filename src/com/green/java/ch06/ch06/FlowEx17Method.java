package com.green.java.ch06.ch06;


class a {

    public static void printStarLine(int star) {
        for (int i = 0; i <star ; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printStarRect(int star) {
        for (int i = 0; i < star; i++) {
            printStarLine(star);
        }
    }
    public static void printStarTri(int star) {
        for (int i = 1; i <= star; i++) {
            printStarLine(i);
        }
    }

}
public class FlowEx17Method {

    public static void main(String[] args) {
        int star = 5;

        a a = new a();

        a.printStarLine(3);
        a.printStarLine(star);

        a.printStarRect(3);
        a.printStarTri(4);


    }
}
