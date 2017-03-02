package com.svlugovoy.youtube300plus.q176_q_q180;

import java.util.Properties;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 02.03.2016.
 */
public class StringDemo {
    public static void main(String[] args) {

        String str = "0123456789string12345string";
        System.out.println(str);
        System.out.println("-------------");

        System.out.println(str.substring(10));
        System.out.println(str.substring(10, 16));
        System.out.println(str.indexOf("str"));
        System.out.println(str.lastIndexOf("str"));
        System.out.println("-------------");

        Properties prop = System.getProperties();
        System.out.println(prop);
        System.out.println("-------------");
        String[] arr = prop.toString().split(",");
        for (String s : arr) {
            if (s.contains("version") || s.contains("os")) {
                System.out.println(s.trim());
            }
        }
        System.out.println("-------------");

        int i = 123;
        String s = String.valueOf(i);
        System.out.println(s);
        System.out.println("-------------");

        System.out.println(str.charAt(10));
        System.out.println("-------------");

        System.out.println(str.contains("789"));
        System.out.println(str.contains("789t"));
        System.out.println(str.indexOf("789"));
        System.out.println(str.lastIndexOf("g"));
        System.out.println("-------------");


    }
}
