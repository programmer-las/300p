package com.svlugovoy.youtube300plus.q336;

import java.util.Arrays;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 13.03.2016.
 */
public class SimpleDemo {
    public static void main(String[] args) {

        Dog db;
        db = Dog.Boxer;
        System.out.println(db);
        db = Dog.Pitbul;
        System.out.println(db);

        switch (db){
            case Boxer:
                System.out.println("Боксер!");
                break;
            case Pitbul:
                System.out.println("Питбуль!");
                break;
            case Pikines:
                System.out.println("Пикинес!");
                break;
            default:
                System.out.println("Другая порода!");
                break;
        }

        Dog[] dogs = Dog.values();
        System.out.println(Arrays.toString(dogs));
        Dog boxer = Dog.valueOf("Boxer");
        System.out.println(boxer);

        System.out.println(Dog.class.getSuperclass());

    }

}
