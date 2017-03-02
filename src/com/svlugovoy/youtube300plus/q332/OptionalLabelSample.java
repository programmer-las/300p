package com.svlugovoy.youtube300plus.q332;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.03.2016.
 */
public class OptionalLabelSample {
    public static void main(String[] args) {

        OUTER_LOOP: for (int i = 0; i < 5; i++) {
            INNER_LOOP: for (int y = 0; y < 5; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");

        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};

        int search = 2;
        int posX = -1;
        int posY = -1;

        PARENT_LOOP: for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {

                if (list[i][j] == search) {
                    posX = i;
                    posY = j;
                    break PARENT_LOOP;
                }
            }
        }

//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list[i].length; j++) {
//
//                if (list[i][j] == search) {
//                    posX = i;
//                    posY = j;
//                    break;
//                }
//            }
//        }

//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list[i].length; j++) {
//
//                if (list[i][j] == search) {
//                    posX = i;
//                    posY = j;
//                }
//            }
//        }

        if (posX == -1 || posY == -1) {
            System.out.println("Value " + search + " not found!");
        } else {
            System.out.println("Value " + search + " found at: "
                    +"( " + posX + ", " + posY + " )");
        }
    }
}