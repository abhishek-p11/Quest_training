package com.quest.File;

import java.io.*;

public class BufferedClass {
    public static void main(String[] args) {
        String str="hello world";
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file1.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file2.txt"));
            byte[] buf = new byte[1024];
            int c;
            while((c=bis.read(buf))!= -1){
                bos.write(buf,0,c);
                System.out.print((char)c);

            }
            bos.flush();
            bis.close();
            bos.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
