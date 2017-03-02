package com.svlugovoy.youtube300plus.q181_q_q184;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 17.03.2016.
 */
public class InternAndCompare {
    public static void main(String[] args) {

        String sPool = "Java";
        String str = new String("Java");
        StringBuffer sbf = new StringBuffer("Java");
        StringBuilder sbd = new StringBuilder("Java");

        System.out.println(sPool == str);
        str = str.intern();
        System.out.println(sPool == str);
        System.out.println("-------------------");

        System.out.println(str.equals(sbf));
        System.out.println(str.equals(sbf.toString()));
        System.out.println(sbf.equals(sbd));
        System.out.println(sbf.toString().equals(sbd.toString()));
        System.out.println(str.contentEquals(sbf));

    }
}
