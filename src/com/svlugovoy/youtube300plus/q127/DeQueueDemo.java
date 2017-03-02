package com.svlugovoy.youtube300plus.q127;

import java.util.*;

public class DeQueueDemo {
    public static void main(String[] args) {
        Deque<String> q = new ArrayDeque<>();
        q.add("1й");
        q.add("2й");
        System.out.println(q.add("3й"));
        System.out.println(q.offer("4й"));

        System.out.println(q);

        q.addFirst("addFirst");
        q.addLast("addLast");
        System.out.println(q);

        q.push("push1");
        q.push("push2");
        System.out.println(q);
        q.pop();
        System.out.println(q);

    }
}