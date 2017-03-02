package com.svlugovoy.youtube300plus.q185_q186_q187;

import java.io.*;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 25.02.2016.
 */
public class WriteArrDemo {
    public static void main(String[] args) {
        String[] arr = {"one ", "two ", "3"};

        File fByte = new File("E:\\test\\byte.data");
        File fSymb = new File("E:\\test\\symbol.txt");

        try (FileOutputStream fos = new FileOutputStream(fByte);
             FileWriter fw = new FileWriter(fSymb);) {

            for (String s: arr) {
                fos.write(s.getBytes());
                fw.write(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
