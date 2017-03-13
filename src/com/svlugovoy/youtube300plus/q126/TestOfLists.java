package com.svlugovoy.youtube300plus.q126;
/*
https://www.youtube.com/watch?v=JVPyGabCh8w
http://ideone.com/
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by a on 04.03.2017.
 */
public class TestOfLists {
    public static void main(String[] args) {

        System.out.println("\nstart test: FILL");
        FillTest ff = new FillTest();
        ff.testListFilling(new ArrayList<Integer>(), "ArrayList time");
        ff.testListFilling(new LinkedList<Integer>(), "LinkedList time");
        ff.testListFilling(new Vector<Integer>(), "Vector time");

        System.out.println("\nstart test: ADD");
        FillAddTest fa = new FillAddTest();
        fa.testListGettingByIndex(new ArrayList<Integer>(), "ArrayList time");
        fa.testListGettingByIndex(new LinkedList<Integer>(), "LinkedList time");
        fa.testListGettingByIndex(new Vector<Integer>(), "Vector time");

        System.out.println("\nstart test: CONTAINS");
        FillContainsTest fc = new FillContainsTest();
        fc.testListGettingByIndex(new ArrayList<Integer>(), "ArrayList time");
        fc.testListGettingByIndex(new LinkedList<Integer>(), "LinkedList time");
        fc.testListGettingByIndex(new Vector<Integer>(), "Vector time");

        System.out.println("\nstart test: GET");
        FillGetTest fg = new FillGetTest();
        fg.testListGettingByIndex(new ArrayList<Integer>(), "ArrayList time");
        fg.testListGettingByIndex(new LinkedList<Integer>(), "LinkedList time");
        fg.testListGettingByIndex(new Vector<Integer>(), "Vector time");

        System.out.println("\nstart test: REMOVE");
        FillRemoveTest fr = new FillRemoveTest();
        fr.testListGettingByIndex(new ArrayList<Integer>(), "ArrayList time");
        fr.testListGettingByIndex(new LinkedList<Integer>(), "LinkedList time");
        fr.testListGettingByIndex(new Vector<Integer>(), "Vector time");


    }
}
