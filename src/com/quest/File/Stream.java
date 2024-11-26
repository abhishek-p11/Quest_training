package com.quest.File;

import java.io.*;

public class Stream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file1.txt");
            System.out.println("file is created successfully");
            int c;
            String str="input as streams";
            FileOutputStream fos = new FileOutputStream("file1.txt");
            fos.write(str.getBytes());
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fis.close();
            fos.close();
            System.out.println("\nfile is closed successfully");
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
