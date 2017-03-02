package com.svlugovoy.youtube300plus.q201;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 10.03.2016.
 */
public class UnPackZip {

    private File destFile;
    public final int BUFFER = 1024;

    public void unPack(String destinationDirectory, String nameZip) {

        File sourceZip = new File(nameZip);

        try (ZipFile zFile = new ZipFile(sourceZip);) {
            File unzipDir = new File(destinationDirectory);

            // открытие архива для распаковки
            Enumeration<? extends ZipEntry> zipFileEntries = zFile.entries();
            while (zipFileEntries.hasMoreElements()) {

                //извлечение текущей записи из архива
                ZipEntry entry = zipFileEntries.nextElement();
                String entryName = entry.getName();
                System.out.println("Extracting: " + entry);
                destFile = new File(unzipDir, entryName);

                // определение каталога
                File destinationParent = destFile.getParentFile();

                // создание структуры каталогов
                destinationParent.mkdirs();

                // распаковывание записи если она не каталог
                if (!entry.isDirectory()) {
                    writeFile(zFile, entry);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(ZipFile zFile, ZipEntry entry) {
        int currentByte;
        byte[] data = new byte[BUFFER];

        try (BufferedInputStream bis = new BufferedInputStream(zFile.getInputStream(entry));
             FileOutputStream fos = new FileOutputStream(destFile);
             BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER);) {

            // запись файла на диск
            while ((currentByte = bis.read(data, 0, BUFFER)) > 0){
               bos.write(data, 0, currentByte);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
