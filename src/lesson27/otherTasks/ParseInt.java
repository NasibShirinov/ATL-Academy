package lesson27.otherTasks;

import java.util.Scanner;

public class ParseInt{

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int num = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("reqem cap elede ala");
        }
    }
}
