package com.svlugovoy.youtube300plus.q62_q_q68;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 17.02.2016.
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        System.out.println("-----------------------------------");
        outer.test2();
        System.out.println("-----------------------------------");
        Outer.Inner inner = new Outer().new Inner();
        inner.display();
        System.out.println("-----------------------------------");
//        Outer.Inner2 inner2 = new Outer().new Inner2();
    }
}

class Outer {
    int outer_var = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

//    void showInnerVar(){
//        System.out.println(inner_var);
//    }

    // member inner class
    class Inner {
        int inner_var = 200;

        void display() {
            System.out.println("Это метод display() в class Inner, переменная outer_var = " + outer_var);
        }
    }

    void test2() {
        for (int i = 0; i < 3; i++) {
            //local inner class
            class Inner2 {
                void display2(){
                    System.out.println("Это метод display2() в class Inner2, переменная outer_var = " + outer_var);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display2();
        }
    }

}
