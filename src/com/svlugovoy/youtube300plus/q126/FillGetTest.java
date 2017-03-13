package com.svlugovoy.youtube300plus.q126;
/*
https://www.youtube.com/watch?v=JVPyGabCh8w
http://ideone.com/r4hmq9
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class FillGetTest
{
    public static final int COUNT = 1000000;
    public static final int NANO = 1000000000;

    public static void main(String[] args) throws java.lang.Exception{
        testListGettingByIndex(new ArrayList<Integer>(), "ArrayList time");
        testListGettingByIndex(new LinkedList<Integer>(), "LinkedList time");
        testListGettingByIndex(new Vector<Integer>(), "Vector time");
    }

    public static void testListGettingByIndex(List list, String title) {
        fillList(list, COUNT);
        int index = COUNT / 2;
        long startNanoTime = getCurrentNanoTime();
        list.get(index);
        long endNanoTime = getCurrentNanoTime();
        System.out.println(title + " : "
                + convertToSeconds(endNanoTime - startNanoTime)
                + " seconds");
    }

    private static void fillList(List<Integer> list, int count) {
        for (int i = 0; i< count; i++){
            list.add(i);
        }
    }

    private static long getCurrentNanoTime() {
        return System.nanoTime();
    }

    private static String convertToSeconds(double nanoTime) {
        return String.valueOf(nanoTime / NANO);
    }


}