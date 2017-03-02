package com.svlugovoy.youtube300plus.q62_q_q68;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 17.02.2016.
 */
public class AnonymousDemoClass {
    public static void main(String[] args) {

        new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println("Go!!!");
            }
        })).start();
    }

}
