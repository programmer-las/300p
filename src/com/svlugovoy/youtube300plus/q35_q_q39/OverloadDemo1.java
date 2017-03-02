package com.svlugovoy.youtube300plus.q35_q_q39;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 31.03.2016.
 */
public class OverloadDemo1 {

    public void doSmth() {}

    void doSmth(int i) {}

    public void doSmth(String s) {}

    public void doSmth(String s, int i) {}

    public void doSmth(String s, int i, double d) throws Exception {}

    protected Object doSmth(Object o) {
        return null;
    }

    static int doSmth(List list) {
        return 10;
    }

    //wrong
//    public boolean doSmth() {return false;}
//    private void doSmth(String s) {}
//    public void doSmth(String text, int num) {}
//    public static void doSmth(String s, int i, double d) {}

    public static void test(int[] nums) {
    }

//    public static void test(int... var) {
//    }

    public static void main(String[] args) {

        test(new int[] {1, 2});
//        test(1, 2, 3, 4, 5);
//        test();
    }

}
