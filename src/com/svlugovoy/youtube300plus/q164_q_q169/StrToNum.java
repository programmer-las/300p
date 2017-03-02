package com.svlugovoy.youtube300plus.q164_q_q169;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 21.02.2016.
 */
public class StrToNum {
    public static void main(String[] args) {

        String str = "100";

           int i = Integer.valueOf(str);
           double d = Double.valueOf(str);
           byte b = Byte.valueOf(str);

        System.out.println(i + " " + d + " " + b);

    }
}
