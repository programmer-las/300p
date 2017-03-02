package com.svlugovoy.youtube300plus.q164_q_q169;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 21.02.2016.
 */
public class EqualStr {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println("-----------------");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
