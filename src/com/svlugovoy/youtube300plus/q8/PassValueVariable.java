package com.svlugovoy.youtube300plus.q8;

/**
 * Created by Sergey on 11.10.2015.
 */
public class PassValueVariable {

    public static void Receiving(int i) {
        i = i + 5;
        System.out.println("Inside method i = " + i);
    }

    public static void main(String[] args) {
        int i = 5;
        Receiving(i);
        System.out.println("The value of passing is: " + i + "\n");

        Person ivan = new Person("Ivan");
        System.out.println(ivan.getName() + "\t\treference = " + ivan);

        Person kolya = new Person("Nikolay");
        System.out.println(kolya.getName() + "\t\treference = " + kolya + "\n");

        kolya = ivan;
        System.out.println("ivan.getName()\t" + ivan.getName() + "\t\treference = " + ivan);
        System.out.println("kolya.getName()\t" + kolya.getName() + "\t\treference = " + kolya);
    }
}

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}