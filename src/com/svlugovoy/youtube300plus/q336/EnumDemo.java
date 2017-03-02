package com.svlugovoy.youtube300plus.q336;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 13.03.2016.
 */

enum Dog1 {
    Boxer(35), Pudel(10), Pitbul(30), Dvornyaga ;

    private int weight;

    Dog1(int weight) {
        this.weight = weight;
    }

    Dog1() {
        weight = 20;
    }

    public int getWeight() {
        return weight;
    }
}

public class EnumDemo {
    public static void main(String[] args) {

        Dog1 dog1;
        System.out.println("Взрослый боксер весит: " + Dog1.Boxer.getWeight());
        System.out.println("Собачки весят:");
        for (Dog1 d: Dog1.values()) {
            System.out.println(d + " = " + d.getWeight() + " kg.");
        }
    }
}
