package com.svlugovoy.youtube300plus.q171_q_q175;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 26.02.2016.
 */
public class StringDemo {
    public static void main(String[] args) {

        String str1 = "   Java   ";
        System.out.println(str1);
        System.out.println(str1.trim());
        System.out.println(str1);
        System.out.println("------------------------");

        String str2 = "Hello. Java!!!";
        System.out.println(str2);
        System.out.println(str2.replace('!', '.'));
        StringBuilder sb = new StringBuilder(str2);
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        System.out.println("------------------------");

        String str3 = "Substring demo...";
        System.out.println(str3);
        System.out.println(str3.substring(1));
        System.out.println(str3.substring(1, 7));
        System.out.println("------------------------");

        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        s2 = s2.intern();
        System.out.println(s1 == s2);
    }
}
