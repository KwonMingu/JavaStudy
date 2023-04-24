package com.green.java.ch06.ch06;

class IntBox{
    int n;
}

public class ParamsTest2 {
    public static void main(String[] args) {
        IntBox ib1 = new IntBox();
        ib1.n = 11;

        IntBox ib2 = new IntBox();
        ib2.n = 22;

        ib1=ib2;

        System.out.println(ib1.n);
    }
    public static void changeIntBox(IntBox ib){
        ib.n=33;

    }

}
