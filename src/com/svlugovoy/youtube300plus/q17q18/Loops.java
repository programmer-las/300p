package com.svlugovoy.youtube300plus.q17q18;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 12.02.2016.
 */
public class Loops {
    public static void main(String[] args) {

        // 1) while
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println('\n' + "-------------------------------");

        // 2) do-while
        int j = 11;
        do {
            System.out.println(j + " ");
            j++;
        } while (j < 10);
        System.out.println("j = " + j);
        System.out.println("-------------------------------");

        // 3) for
        for (int k = 0; k < 10; k++) {
            System.out.print(k + " ");
        }
        System.out.println('\n' + "-------------------------------");

        // empty body
        int d=100, f=200;
        while(++d < --f) ;
        System.out.println("Среднее значение = " + d);

        //infinity loop
        for (;;){
            System.out.println("Java - forever");
        }

    }
}
