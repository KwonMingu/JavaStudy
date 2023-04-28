package com.green.java.abstract2;

public class AbstractClassStudyTest1 {
    public static void main(String[] args) {
        //AbstractClassStudy1 acs1 = new AbstractClassStudy1();
        AbstractClassStudy1 acs1 = new ChildClass();
        acs1.sum(10, 20);

        AbstractClassStudy1 acs2 = new ChildClass();
        acs2.sum(10, 20);


    }
}
