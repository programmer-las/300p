package com.svlugovoy.youtube300plus.q188_q189;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 02.03.2016.
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) {

        String fPath = "E:\\test\\ras.txt";

        try (RandomAccessFile fileR = new RandomAccessFile(fPath, "r");
             RandomAccessFile fileRW = new RandomAccessFile(fPath, "rw");
             RandomAccessFile fileRW1 = new RandomAccessFile("E:\\test\\ras1.txt", "rw");
        ) {

            String tmp = "";
            while ((tmp = fileR.readLine()) != null) {
                System.out.println(tmp);
            }
            System.out.println("--------------------");

            fileR.seek(3);
            byte[] bytes = new byte[12];
            fileR.read(bytes);
            System.out.println(new String(bytes));
            System.out.println("--------------------");

            fileRW.seek(3);
            fileRW.write("* ****".getBytes());

            fileRW1.seek(5);
            fileRW1.write("Hello!!!".getBytes());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
