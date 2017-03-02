package com.svlugovoy.youtube300plus.q201;

import java.io.FileNotFoundException;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 10.03.2016.
 */
public class PackDemo {
    public static void main(String[] args) {

        String dirName = "E:\\test\\";
        PackZip pj = new PackZip("E:\\test2\\example.zip");

        try {
            pj.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
