package com.svlugovoy.youtube300plus.q24q25;

import javax.jws.soap.SOAPBinding;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 18.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        int a  = 50;
        Integer a1 = 50;
        Integer a2 = 50;
        Integer b1 = 500;
        Integer b2 = 500;
        System.out.println("a1==a2 " + String.valueOf(a1==a2));
        System.out.println("b1==b2 "  + String.valueOf(b1==b2));

        String arg = "1000";

        try {
            int value1 = Integer.parseInt(arg); // возвращает int
            Integer value2 = Integer.valueOf(arg); // возвращает Integer
            Integer value3 = new Integer(arg); // создает Integer
            Integer value4 = new Integer(arg); // создает Integer

            System.out.println("value2==value3 " + String.valueOf(value2==value3));
            System.out.println("value1==value3 " + String.valueOf(value1==value3));
            System.out.println("value3==value2 " + String.valueOf(value3==value2));
            // todo done Why can't create obj Integer?
            System.out.println("value4==value3 " + String.valueOf(value4==value3));
            System.out.println(value2.getClass().getName());

        } catch (NumberFormatException ex){
            System.out.println("Wrong format " + ex);
        }

        int value = 200;
        String arg1 = Integer.toString(value);
        String arg2 = String.valueOf(value);
        String arg3 = "" + value;

        int prmj = 100;
        Integer iobj = 100; // Integer iobj = new Integer(100);
        Integer iobj1 = 100;
        System.out.print("Does iobj==iobj1? " );
        System.out.println(iobj==iobj1);
        int iprim = iobj; // int iprim = iobj.intValue();

//    Float fl = 7;
        Float fl1 = (float)7; // Float fl1 = new Float(7);

        Boolean b = null;
        System.out.println(String.valueOf(b));    // Prints null
//        System.out.println(Boolean.toString(b));  // Throws NPE
    }




}
