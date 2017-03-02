package com.svlugovoy.youtube300plus.q40_q_q44;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 01.04.2016.
 */
class Parent{

    void test(){
        System.out.println("... from Parent");
    }
}

public class Child extends Parent{

    @Override
    void test(){
        System.out.println("... from Child");
    }

    void testSup(){
        super.test();
    }

    public static void main(String[] args) {

        Child child = new Child();
        child.test();

        Parent parent = new Parent();
        parent.test();

        parent = child;
        parent.test();

        child.testSup();

//        parent.testSup();


    }
}
