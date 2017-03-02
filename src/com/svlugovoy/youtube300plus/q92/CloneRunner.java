package com.svlugovoy.youtube300plus.q92;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 03.03.2016.
 */
public class CloneRunner {
    public static void main(String[] args) {

        Man man = new Man();
        System.out.println("id = " + man.getId());

        mutation(man);
        System.out.println("id = " + man.getId());

    }

    private static void mutation(Man man){
        try {
            man = (Man)man.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        man.setId(200);
        System.out.println("*id = " + man.getId());
    }
}
