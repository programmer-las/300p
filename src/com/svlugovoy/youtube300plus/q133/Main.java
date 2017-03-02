package com.svlugovoy.youtube300plus.q133;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 12.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        // Type Safety + .toString() + Null values
        String[] strings = new String[10];
        strings[0] = "a";
//        strings[1]= 1;
        strings[2] = String.valueOf(1);
        strings[3] = null;

        int[] ints = new int[10];
//        ints[0]= null;

        System.out.println(strings);
        System.out.println(Arrays.toString(strings));

        ArrayList list1 = new ArrayList();

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList();
        list2.add("a");
//        list2.add(1);
//        list2.add(new Date());
        list2.add(String.valueOf(1));
        list2.add(String.valueOf(new Date()));

        System.out.println("-------------------------------");

        // Iteration
        // Array & ArrayList
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();

        int i = 0;
        while (i < strings.length) {
            System.out.print(strings[i] + " ");
            i++;
        }
        System.out.println();

        // ArrayList
        Iterator<String> itr = list2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
            itr.remove();
        }
        System.out.println();
        System.out.println(list2.size());

        System.out.println("-------------------------------");

        // Size() vs length
        System.out.println(strings.length);
        System.out.println(list1.size());
    }
}
