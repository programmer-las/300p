package com.svlugovoy.youtube300plus.q201;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 10.03.2016.
 */
public class UnpackDemo {
    public static void main(String[] args) {

        String nameZip = "E:\\test2\\example.zip";
        String destinationPath = "E:\\test3\\";

        new UnPackZip().unPack(destinationPath, nameZip);

    }
}
