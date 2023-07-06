package com.green.java.Nado.chap_14;


@FunctionalInterface
interface MyFunction{
    void run();
}
public class LamdaEx1 {
    static void execute(MyFunction f) {
        f.run();
    }

    public static MyFunction getmyFunction() {
        return () -> System.out.println("mf1");
    }

    public static void main(String[] args) {
        MyFunction mf1 = getmyFunction();
        execute(mf1);

        mf1.run(); //"mf1"

    }

}
