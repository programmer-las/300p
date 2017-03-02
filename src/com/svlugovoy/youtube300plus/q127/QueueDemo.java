package com.svlugovoy.youtube300plus.q127;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("1й");
        q.add("2й");
        System.out.println(q.add("3й"));
        System.out.println(q.offer("4й"));

        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
    }
}
