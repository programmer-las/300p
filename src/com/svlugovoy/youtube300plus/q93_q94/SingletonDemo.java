package com.svlugovoy.youtube300plus.q93_q94;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 25.03.2016.
 */
public class SingletonDemo {
    public static void main(String[] args) {

//        Singleton obj = new Singleton();

        Singleton object = Singleton.getInstance();
        object.showMessage();

    }
}

class Singleton {

    //create an object of SingleObject
    private static Singleton instance = new Singleton();

    //make the constructor private so that this class cannot be instantiated
    private Singleton() {
    }

    //Get the only object available
    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}

class SingletonL {
    private static SingletonL instance;

    public static synchronized SingletonL getInstance() {
        if (instance == null) {
            instance = new SingletonL();
        }
        return instance;
    }
}

// http://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
// http://skipy.ru/technics/singleton.html
// https://habrahabr.ru/post/129494/