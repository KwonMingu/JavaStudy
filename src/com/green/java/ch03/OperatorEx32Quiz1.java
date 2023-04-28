package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public static void main(String[] args) {
        int x = 10, y = -5, z = 0;
        int absX, absY, absZ;

        OperatorEx32Quiz1 op = new OperatorEx32Quiz1();

        absX = op.getAbs(x);
        absY = op.getAbs(y);
        absZ = op.getAbs(z);

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
        System.out.println("absZ : " + absZ);
    }

    public int getAbs(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }


}





