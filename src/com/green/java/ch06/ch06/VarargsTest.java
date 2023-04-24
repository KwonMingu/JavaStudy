package com.green.java.ch06.ch06;

public class VarargsTest {
    public static void main(String[] args) {
        sum(1);
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4,5,6,7,8,9,10);
    }

    static void sum(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
        }
//        for(int val : nums) {
//            sum+=val;
//        }
        System.out.println(sum);

    }
}
