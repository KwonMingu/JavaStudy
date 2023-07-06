package com.green.java.Nado.chap_14;

public class FightableTest {

    public static void run(Fightable f) {
        f.punch();
    }

    public static void main(String[] args) {
        StreetFighter sf = new StreetFighter();

        run(sf);

        run(new Fightable() {
            @Override
            public void punch() {
                System.out.println("머리 박치기를 한다.");
            }
        });

        Fightable f1 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("zzz");
            }
        };

    }
}

class StreetFighter implements Fightable {

    @Override
    public void punch() {
        System.out.println("주먹을 날린다.");
    }
}
