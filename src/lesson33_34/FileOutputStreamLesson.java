package lesson33_34;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class FileOutputStreamLesson {
    public static final String RESOURCE = "src/lesson33/resource/";

    public static void main(String[] args) {
//        FileOutputStream fos = null;
        Random rn = new Random();
        byte[] ranArr = new byte[10];

        for (int i = 0; i < ranArr.length; i++) {
            ranArr[i] = (byte) rn.nextInt(100);
        }

        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "a.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            bos.write("Ilqar".getBytes());
            bos.write(ranArr);
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "a.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            String str = new String(bis.readAllBytes());
            byte[] bytes = bis.readAllBytes();
            System.out.println(str);
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
