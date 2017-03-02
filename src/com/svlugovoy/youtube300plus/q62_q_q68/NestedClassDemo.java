package com.svlugovoy.youtube300plus.q62_q_q68;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 17.02.2016.
 */
public class NestedClassDemo {
    public static void main(String[] args) {

        OuterN.Nested.displayStat();
        System.out.println("-----------------------------");
        OuterN.Nested nested = new OuterN.Nested();
        nested.display();
    }
}

class OuterN {
    int outer_var = 100;
    static int outer_stat_var = 150;

    static class Nested {

        void display() {
//            System.out.println("Это метод display() в class Nested, переменная outer_var = " + outer_var);
            OuterN outerN = new OuterN();
            System.out.println(outerN.outer_var);
            System.out.println("Это метод display() в class Nested, переменная outer_stat_var = " + outer_stat_var);
        }

        static void displayStat(){
            System.out.println("Это метод displayStat() в class Nested");
        }
    }



}