package com.svlugovoy.youtube300plus.q7;

/**
 * Created by Sergey on 11.10.2015.
 */
public class Value {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
    static Object object;

    {
        int i;
//        System.out.println(i);
    }

    public static void main(String[] args) {
        int i;
        Value value = new Value();
        System.out.println(value.a + "\t" + value.b + "\t" + value.c + "\t" + value.d
                + "\t" + value.e + "\t\t" + value.f + "\t\t" + (int) value.g + "\t" + value.h);
        System.out.println(object);
        System.out.println((int) '\u0000');
    }
}
