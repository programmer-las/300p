package com.svlugovoy.youtube300plus.q160_q_q162;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 24.03.2016.
 */
public class FactorialDemo {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println("-------------");

        for (int i = 0; i < 10; i++){
            System.out.println(i + "! =  " + factorial(i));
        }
        System.out.println("-------------");

        for (int i = 0; i < 10; i++){
            System.out.println(i + "! =  " + factorialWithLoop(i));
        }

    }

    static int factorial(int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    static int factorialWithLoop(int x){
        int f = 1;
        for (int i = 1; i <= x; i++){
            f = f*i;
        }
        return f;
    }
}
