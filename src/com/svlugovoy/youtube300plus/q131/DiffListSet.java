package com.svlugovoy.youtube300plus.q131;

import java.util.*;

public class DiffListSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new LinkedHashSet<>();

        list.add("a");
        list.add("b");
        list.add(null);
        list.add(null);
        list.add(4,"c");
        list.add("c");

        set.add("a");
        set.add("b");
        set.add("b");
        set.add(null);
        set.add(null);

        System.out.println(list);
        System.out.println(set);
    }
}
