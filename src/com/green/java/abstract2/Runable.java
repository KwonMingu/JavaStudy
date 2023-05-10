package com.green.java.abstract2;

public interface Runable extends CanFly, Fightable{
    void run();
    void move(int x, int y);

}
