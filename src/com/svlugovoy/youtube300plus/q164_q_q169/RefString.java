package com.svlugovoy.youtube300plus.q164_q_q169;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 21.02.2016.
 */
public class RefString {

    public static void main(String[] args) {
        String s = new String("I love Java");
        System.out.println(s);
        changeString(s);
        System.out.println(s);
        System.out.println("--------------------");

        StringBuffer sb = new StringBuffer("I love Java");
        System.out.println(sb);
        changeStringBuff(sb);
        System.out.println(sb);
    }

    public static void changeStringBuff(StringBuffer sb) {
        sb.append("!!!");
    }

    public static void changeString(String s) {
        s = s.concat("!!!") + "**!!!";
        System.out.println(s + " - in method changeString()");
    }

}


