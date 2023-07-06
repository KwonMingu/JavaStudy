package com.green.java.Nado.chap_14;

public class FightableLambdaTest {
    public static void run(Fightable f) {
        f.punch();
    }

    public static void main(String[] args) {
        Fightable f1 = () -> {
            System.out.println("zzz");
        };
        run(f1);
    }

}
