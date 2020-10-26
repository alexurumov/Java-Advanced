package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "/Users/macbookair/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);

            int byteData = inputStream.read();

            while (byteData >= 0) {
                System.out.println(byteData);

                byteData = inputStream.read();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
