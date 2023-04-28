package com.green.java.ch02;

import java.lang.reflect.Array;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);


        boolean r1 = (nb1==nb2);
        System.out.println(r1);
        boolean r2 = nb1.equals(nb2);
        System.out.println(r2);

    }
}

class NumberBox {
    private int num;

    NumberBox(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof NumberBox)) {
            return false;
        }

        return this.num == ((NumberBox) obj).getNum();
    }

}
