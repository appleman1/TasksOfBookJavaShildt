package com.falkenberg.viktor.chapter10.question7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    protected static void copyFile() {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream("resourses/2.txt");
            fileInputStream = new FileInputStream("resourses/1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (fileInputStream.available() != 0) {
                int value = fileInputStream.read();
                if (value == 32) {
                    value = 45;
                }
                fileOutputStream.write(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
