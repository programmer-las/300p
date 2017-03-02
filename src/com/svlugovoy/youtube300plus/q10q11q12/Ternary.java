package com.svlugovoy.youtube300plus.q10q11q12;

public class Ternary {
    public static void main(String args[]) {
        int number;
        String text;

        number = 3;

        text = (number % 2 == 0) ? "четное" : "нечетное";
        System.out.println("Число " + number + " - " + text + "!");

        if (number % 2 == 0) {
            text = "четное";
        } else {
            text = "нечетное";
        }
        System.out.println("То же самое, только с if-else");
        System.out.println("Число " + number + " - " + text + "!");
    }
}
