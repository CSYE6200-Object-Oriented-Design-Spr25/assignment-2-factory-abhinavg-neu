package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileUtil {

    private String fileName;

   Scanner scanner; 

   public FileUtil() {
    scanner = new Scanner(System.in);
   }
   public BufferedReader readFile(String fileName) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
            fileName = fileName.replace(".csv", "");
            return reader;
        } catch (IOException e) {
        e.printStackTrace();
        }
        return null;
    }

    public BufferedWriter getWriter(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            fileName = fileName.replace(".csv", "");
            return writer;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public BufferedWriter writeFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            fileName = fileName.replace(".csv", "");
            writer.close();
            return writer;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
