package com.svlugovoy.youtube300plus.q332;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 09.03.2016.
 */
public class OtherSample {
    public static void main(String[] args) {

        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                System.out.print(" " + a + x);
            }
        }
        System.out.println("\n-------------------");

        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue;
                System.out.print(" " + a + x);
            }
        }
        System.out.println("\n-------------------");

        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                System.out.print(" " + a + x);
            }
        }
        System.out.println("\n-------------------");

    }
}
