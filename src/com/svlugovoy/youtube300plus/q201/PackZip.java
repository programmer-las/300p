package com.svlugovoy.youtube300plus.q201;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 10.03.2016.
 */
public class PackZip {

    private String zipFileName;
    public final int BUFFER = 1024;

    public PackZip(String zipFileName) {
        this.zipFileName = zipFileName;
    }

    public void pack(String dirName) throws FileNotFoundException {

        // получение списка имен файлов в директории
        File dir = new File(dirName);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + " not found");
        }
        File[] files = dir.listFiles();
        ArrayList<String> listNamesFilesToZip = new ArrayList<>();
        ArrayList<String> listFilesToZip = new ArrayList<>();

        for (File file : files) {
            if (!file.isDirectory()) {
                listNamesFilesToZip.add(file.getName());
                listFilesToZip.add(file.getPath());
            }
        }

        String[] temp = {};
        String[] filesToZip = listFilesToZip.toArray(temp);
        String[] namesFilesToZip = listNamesFilesToZip.toArray(temp);

        // архивирование
        try (FileOutputStream fos = new FileOutputStream(zipFileName);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            byte[] buffer = new byte[BUFFER];
            // метод сжатия
            zos.setLevel(Deflater.DEFAULT_COMPRESSION);

            for (int i = 0; i < filesToZip.length; i++) {
                zos.putNextEntry(new ZipEntry(namesFilesToZip[i]));
                try (FileInputStream fis = new FileInputStream(filesToZip[i])) {
                    int len;
                    while ((len = fis.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }
                    zos.closeEntry();
                } catch (FileNotFoundException e) {
                    System.err.println("Файл не найден " + e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Некорректный аргумент " + e);
        } catch (IOException e) {
            System.err.println("Ошибка доступа " + e);
        }
    }
}
