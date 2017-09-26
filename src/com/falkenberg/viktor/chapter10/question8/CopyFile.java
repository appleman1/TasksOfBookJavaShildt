package com.falkenberg.viktor.chapter10.question8;

import java.io.*;

public class CopyFile {
    protected static void copyFile() {


        try (BufferedReader fileReader = new BufferedReader(new FileReader("resourses/1.txt"));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("resourses/2.txt"))) {
            while (fileReader.ready()) {
                String value = String.valueOf((char) fileReader.read());

                if (value.equals(" ")) {
                    value = "-";
                }
                fileWriter.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        }



}
