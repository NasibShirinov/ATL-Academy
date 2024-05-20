package lesson33_34;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterApp {
    public static final String RESOURCE = "src/lesson33/resource/";

    public static void main(String[] args) {
//        File file = new File(RESOURCE + "hello.txt");
        /*try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
//            fw.write();
            bw.write("Hello World");
            bw.close();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }*/

        try (FileWriter fileWriter = new FileWriter("my_file.txt", true)) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\nHello World");
            bufferedWriter.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (FileReader fr = new FileReader("my_file.txt")) {
            BufferedReader bw = new BufferedReader(fr);
            System.out.println(bw.readLine());
            String line;
            while ((line = bw.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
