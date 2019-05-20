package com.miaochaofelix.tutorial.io;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        String dir = "/";
        File file = new File(dir);
        if (file.isDirectory()) {
            String subFiles[] = file.list();
            for (int i = 0; i < subFiles.length; i++) {
                File subFile = new File( dir + "/" + subFiles[i]);
                if (subFile.isDirectory()) {
                    System.out.println(" ./" +subFiles[i] + "/");
                } else {
                    System.out.println(" ./" +subFiles[i]);
                }
            }
        } else {
            System.out.println(file);
        }
    }
}
