package com.quest.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream2 {
    public static void main(String[] args) {
        File file=new File("file3.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file created");
            }

            FileOutputStream fos=new FileOutputStream(file,true);
            fos.write("\nprogram\ninput\nstream\nfiles\nhandling".getBytes());
            FileInputStream fis=new FileInputStream(file);
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
            fos.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
