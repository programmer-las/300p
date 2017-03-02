package com.svlugovoy.youtube300plus.q181_q_q184;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 17.03.2016.
 */
public class SbfSbdDemo {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();
        System.out.println("Длина - " + sbf.length());
        System.out.println("Размер - " + sbf.capacity());
        sbf = new StringBuffer(20);
        sbf.append("Java");
        System.out.println(sbf);
        System.out.println("Длина - " + sbf.length());
        System.out.println("Размер - " + sbf.capacity());
        sbf.append(" is a programming language!");
        System.out.println(sbf);
        System.out.println("Длина - " + sbf.length());
        System.out.println("Размер - " + sbf.capacity());
        System.out.println("-------------------");

        System.out.println(sbf);
        StringBuffer sbf1 = new StringBuffer(48);
        sbf1.append("Java is a programming language!");
        System.out.println(sbf1);

        System.out.println(sbf.equals(sbf1));
        System.out.println(sbf.hashCode() == sbf1.hashCode());
        System.out.println(sbf.toString().contentEquals(sbf1));
        System.out.println("-------------------");

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
