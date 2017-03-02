package com.svlugovoy.youtube300plus.q40_q_q44;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 01.04.2016.
 */
class Animal{
    void doAnimal1(){}
    void doAnimal2(){}
}

public class Cat extends Animal{

    void doCat1(){}
    void doCat21(){}

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.doCat1();
        cat.doAnimal1();

        Animal catA = new Cat(); // восходящее преобразование
//        catA.doCat1();
        catA.doAnimal1();

        int i = 125;
        byte b = (byte) i; // нисходящее преобразование (явно!)

    }
}
