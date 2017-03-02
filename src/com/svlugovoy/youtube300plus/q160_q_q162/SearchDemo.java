package com.svlugovoy.youtube300plus.q160_q_q162;

import java.util.Arrays;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 21.03.2016.
 */
public class SearchDemo {
    public static void main(String[] args) {

        int[] arrayDemo = {-10, 20, 15, 45, 50, 1, 500, 0, 56, 7, 77, 35, 80};
        System.out.println(Arrays.toString(arrayDemo));

        System.out.println(linearSearch(arrayDemo, 7));
        System.out.println(binarySearch(arrayDemo, 7));

        Arrays.sort(arrayDemo);
        System.out.println(Arrays.toString(arrayDemo));
        System.out.println(binarySearch(arrayDemo, 7));
        System.out.println(binarySearchRec(arrayDemo, 7));

    }

    static int linearSearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if (midVal < x)
                low = mid + 1;
            else if (midVal > x)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    static int binarySearchRec(int[] array, int x) {
        return binarySearchRec(array, 0, array.length - 1, x);
    }

    public static int binarySearchRec(int[] array, int start, int end, int x) {
        int mid = (start + end) / 2;
        if (end < start) {
            return -1;
        }
        if (x == array[mid]) {
            return mid;
        } else if (x < array[mid]) {
            return binarySearchRec(array, start, mid - 1, x);
        } else {
            return binarySearchRec(array, mid + 1, end, x);
        }
    }

}
