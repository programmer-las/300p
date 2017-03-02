package com.svlugovoy.youtube300plus.q19_q20_q21;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 26.02.2016.
 */
public class ForDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------------");

        for (int i = 0, j = 5; i < 5; i++, j--) {
            System.out.print(i + " " + j + "   ");
        }
        System.out.println("\n-------------------------");


        for (int i = 0; i < 5; i++) {
            System.out.println("Вошли в итерацию внешнего цикла, i = " + i);
            for (int j = 0; j < 7; j++) {
                System.out.print(j + " (" + i + ") ");
            }
            System.out.println("\n------------");
        }
        System.out.println("-------------------------");

//        for (;;){
//
//        }

        int k = 0;
        for (; k < 5; ) {
            System.out.print("abc ");
            k++;
        }
        System.out.println("\n-------------------------");

        for (int a = 0; a < 5; a++) {
            if (a == 3) break;
            System.out.print("abc ");
        }
        System.out.println("\n-------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Вошли в итерацию внешнего цикла, i = " + i);
            for (int j = 0; j < 7; j++) {
                System.out.print(j + " (" + i + ") ");
                if (j == 3) break;
            }
            System.out.println("\n------------");
        }
        System.out.println("-------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println();
        }
        System.out.println("-------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Вошли в итерацию внешнего цикла, i = " + i);
            for (int j = 0; j < 7; j++) {
                System.out.print(j + " (" + i + ") ");
                if (j == 3) return;
            }
            System.out.println("\n------------");
        }
        System.out.println("-------------------------");
    }

}
