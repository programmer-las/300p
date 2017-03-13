package com.svlugovoy.youtube300plus.myQ;

/**
 * Created by a on 07.03.2017.
 */
public class _001CreateClass {
//    static String  s;
    static String  sClass;
//    static int i;
    static int iClass;
    String x = "Hello";
    _001CreateClass(){
        //s = "Hello";
//        this.s = s;
        String s;
        int i;
//        this.i;
    }

//    public static String getS(String S){
    public static String getS(){
        return sClass;
    }

    public static int getI() {
        return iClass;
    }

    public static void main (String[] args){
        System.out.println("main of _001CreateClass");
    }
}