package com.svlugovoy.youtube300plus.q126;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
//        Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
//        Set<String> set = new TreeSet<>();
        set.add("b");
        set.add("c");
        set.add("a");

        System.out.println(set);
        System.out.println(set.add("a"));
        System.out.println(set.contains("c"));
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
