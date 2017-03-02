package com.svlugovoy.youtube300plus.q185_q186_q187;

import java.util.Scanner;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 25.02.2016.
 */
public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double weight;
        int height;
        double delta;
        String action;

        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Your weight (kg)?");
        weight = sc.nextDouble();
        System.out.println("Your height (cm)?");
        height = sc.nextInt();

        delta = height - weight;

        action = (delta > 120) ? "You are thin. Go to the GYM!" :
                ((delta < 80) ? "You are overweight. Go to the GYM and do cardio!" :
                        "You are OK. Go to the GYM!");
        System.out.println("Hello, " + name + "!\nYour weight is " + weight +
                " kg.\nYour height is " + height + " cm.\n" + action);
    }
}
