package com.svlugovoy.youtube300plus.q40_q_q44;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 31.03.2016.
 */
public class VarargsDemo {



    static void fly(int... ints) {
        System.out.println(ints.length);
    }

    static void fly(String s, int... ints) {
        System.out.println(ints.length);
    }

//    static void fly(int... ints, String s){}
//    static void fly(int... ints, String... s){}

//    static void fly(boolean... b){}
//    static void fly(int i, int... ints) {}


    public static void main(String... args) {

        fly(1, 2, 3);
        fly("Hello", 1, 2 , 3, 4, 5);
        fly(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        fly();

    }

}
