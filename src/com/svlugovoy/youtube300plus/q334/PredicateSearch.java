package com.svlugovoy.youtube300plus.q334;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 23.03.2016.
 */
interface Predicate<T> {
    boolean testSkill(T t);
}

public class PredicateSearch {
    public static void main(String[] args) {

        List<Animal> animals1 = new ArrayList<>();
        animals1.add(new Animal("Fish", false, true));

        print1(animals1, a -> ! a.isCanJump());
        System.out.println("--------------------");

        List<String> dogs = new ArrayList<>();
        dogs.add("Boxer");
        dogs.add("Pudel");
        dogs.add("Labrador");
        System.out.println(dogs);
        dogs.removeIf(d -> d.charAt(0) != 'B');
        System.out.println(dogs);
    }

    private static void print1(List<Animal> animals, CheckSkill checker) {
        for (Animal a : animals) {
            if (checker.testSkill(a)) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
