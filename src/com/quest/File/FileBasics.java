package com.quest.File;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileBasics {
    public static void main(String[] args) {
        File file=new File("file1.txt");

        try {
            if (file.createNewFile()||file.exists()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                sc.close();
            } else {
                System.out.println("File does not exist");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
          file.delete();
            System.out.println("File deleted successfully");
        }
    }
}
