package com.svlugovoy.youtube300plus.q160_q_q162;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 25.03.2016.
 */

//https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8
public class FibonacciNumDemo {
    public static void main(String[] args) {

        System.out.println(fibRec(7));

        for (int i = 1; i <= 10; i++){
            System.out.print(fibRec(i) + " ");
        }
        System.out.println();

        printFibNums(10);

    }

    static int fibRec(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static void printFibNums(int n) {
        if (n <= 0) {
            System.out.println("Argument must be >= 1 ...");
            return;
        }
        int i = 0, a = 0, b = 1, sumFib = 1;
        while (i++ < n) {
            System.out.print(sumFib + " ");
            sumFib = a + b;
            a = b;
            b = sumFib;
        }

    }
}
