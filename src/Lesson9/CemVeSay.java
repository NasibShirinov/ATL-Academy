package Lesson9;

import java.util.Scanner;

public class CemVeSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (sc.hasNext()) {
            int num = sc.nextInt();
            count++;
            sum += num;
        }
        System.out.println(count + " " + "=" + sum);
    }
}
