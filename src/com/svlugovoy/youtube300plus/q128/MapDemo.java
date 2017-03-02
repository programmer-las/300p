package com.svlugovoy.youtube300plus.q128;

import java.util.*;

class MapDemo {
    public static void main(String args[]) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("Ivan Ivanov", new Integer(25));
        map.put("Petr Petrov", new Integer(35));
        map.put("Dima Sidorov", new Integer(45));

        System.out.println(map);
        System.out.println(map.put("Dima Sidorov", new Integer(55)));
        System.out.println(map);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> element : set) {
            System.out.print(element.getKey() + ": Age - ");
            System.out.println(element.getValue());
        }
    }
}