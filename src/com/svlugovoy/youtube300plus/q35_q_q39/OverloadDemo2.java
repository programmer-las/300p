package com.svlugovoy.youtube300plus.q35_q_q39;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 31.03.2016.
 */
public class OverloadDemo2 {

    public static void viewNum(Integer i){
        System.out.printf("Integer=%d%n", i);
    }

    public static void viewNum(int i){
        System.out.printf("int=%d%n", i);
    }

    public static void viewNum(float f){
        System.out.printf("float=%.3f%n", f);
    }

    public static void viewNum(Number n){
        System.out.println("Number=" + n);
    }


    public static void main(String[] args) {

        viewNum(new Integer(10));
        viewNum(11);
        viewNum(12.0f);
        viewNum(13.0);
        System.out.println("-------------");

        Number[] nums = {new Integer(10), 11, 12.0f, 13.0};
        for (Number n: nums){
            viewNum(n);
        }
    }

}
