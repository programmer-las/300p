package com.svlugovoy.youtube300plus.q185_q186_q187;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 25.02.2016.
 */
public class ReadDemo {
    public static void main(String[] args) {

        String fPath = "E:\\test\\in.txt";
        int i;

        File f = new File(fPath);
        FileReader fr = null;

        try {
            fr = new FileReader(f);
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
//                Thread.sleep(500);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }


}
