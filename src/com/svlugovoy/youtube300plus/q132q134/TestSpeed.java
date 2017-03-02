package com.svlugovoy.youtube300plus.q132q134;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 20.02.2016.
 */
public class TestSpeed {

    public static final int COUNT = 1_000_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();

        // добавление COUNT-числа элементов
        System.out.println("----------------------------");
        System.out.println("Fill list by " + COUNT + "elements");
        testFillList(arrayList, "ArrayList");
        testFillList(linkedList, "LinkedList");
        testFillList(vector, "Vector");
        System.out.println("Sizes: " + arrayList.size() + " " + linkedList.size() +
                " " + vector.size());
        System.out.println("----------------------------");

        // получение по индексу (COUNT/2)
        System.out.println("Get element by index " + COUNT / 2);
        testGetByIndex(arrayList, "ArrayList");
        testGetByIndex(linkedList, "LinkedList");
        testGetByIndex(vector, "Vector");
        System.out.println("Sizes: " + arrayList.size() + " " + linkedList.size() +
                " " + vector.size());
        System.out.println("----------------------------");

        // поиск по элементу (COUNT/2)
        System.out.println("List contains element " + COUNT / 2);
        testContains(arrayList, "ArrayList");
        testContains(linkedList, "LinkedList");
        testContains(vector, "Vector");
        System.out.println("Sizes: " + arrayList.size() + " " + linkedList.size() +
                " " + vector.size());
        System.out.println("----------------------------");

        // добавление в середину (COUNT/2)
        System.out.println("Add by index " + COUNT / 2);
        testAddByIndex(arrayList, "ArrayList");
        testAddByIndex(linkedList, "LinkedList");
        testAddByIndex(vector, "Vector");
        System.out.println("Sizes: " + arrayList.size() + " " + linkedList.size() +
                " " + vector.size());
        System.out.println("----------------------------");

        // удаление по индексу (COUNT/2)
        System.out.println("Remove by index " + COUNT / 2);
        testDelByIndex(arrayList, "ArrayList");
        testDelByIndex(linkedList, "LinkedList");
        testDelByIndex(vector, "Vector");
        System.out.println("Sizes: " + arrayList.size() + " " + linkedList.size() +
                " " + vector.size());
        System.out.println("----------------------------");
    }


    private static void fillList(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }

    private static void testFillList(List list, String name) {
        long start = System.nanoTime();
        fillList(list, COUNT);
        long end = System.nanoTime();
        double delta = (double) (end - start) / 1000000000;
        System.out.println(name + " : " + String.format("%8.5f", delta) + " sec");
    }

    private static void testGetByIndex(List list, String name) {
        int index = COUNT / 2;
        long start = System.nanoTime();
        list.get(index);
        long end = System.nanoTime();
        double delta = (double) (end - start) / 1000000000;
        System.out.println(name + " : " + String.format("%8.7f", delta) + " sec");
    }

    private static void testContains(List list, String name) {
        Integer elem = COUNT / 2;
        long start = System.nanoTime();
        list.contains(elem);
        long end = System.nanoTime();
        double delta = (double) (end - start) / 1000000000;
        System.out.println(name + " : " + String.format("%8.7f", delta) + " sec");
    }

    private static void testAddByIndex(List list, String name) {
        int index = COUNT / 2;
        long start = System.nanoTime();
        list.add(index, 100);
        long end = System.nanoTime();
        double delta = (double) (end - start) / 1000000000;
        System.out.println(name + " : " + String.format("%8.7f", delta) + " sec");
    }

    private static void testDelByIndex(List list, String name) {
        int index = COUNT / 2;
        long start = System.nanoTime();
        list.remove(index);
        long end = System.nanoTime();
        double delta = (double) (end - start) / 1000000000;
        System.out.println(name + " : " + String.format("%8.7f", delta) + " sec");
    }
}
