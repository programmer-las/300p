package com.svlugovoy.youtube300plus.q185_q186_q187;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 25.02.2016.
 */
public class FileIODemo {
    public static void main(String[] args) {

        String fPath = "E:\\test\\in.txt";
        String fResult = "E:\\test\\result.txt";

        try {
            FileInputStream fis = new FileInputStream(fPath);
            FileOutputStream fos = new FileOutputStream(fResult);

            int s = fis.read();
            while (s != -1) {
                fos.write(s);
                s = fis.read();
            }
            // !!!!!
            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
