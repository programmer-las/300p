package com.svlugovoy.youtube300plus.q334;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 23.03.2016.
 */
class Animal {
    private String typeAnimal;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String typeAnimal, boolean canJump, boolean canSwim) {
        this.typeAnimal = typeAnimal;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public String toString() {
        return typeAnimal;
    }
}

interface CheckSkill {
    boolean testSkill(Animal a);
}

class CheckJump implements CheckSkill {
    @Override
    public boolean testSkill(Animal a) {
        return a.isCanJump();
    }
}

public class SearchDemo {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Dog", true, true));
        animals.add(new Animal("Turtle", false, true));

        print(animals, new CheckJump());

        print(animals, a -> a.isCanJump());
        print(animals, a -> a.isCanSwim());
        print(animals, a -> ! a.isCanSwim());
    }

    private static void print(List<Animal> animals, CheckSkill checker) {
        for (Animal a : animals) {
            if (checker.testSkill(a)) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }

}
