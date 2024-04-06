package homework_30_03_2024;

import java.util.Scanner;

public class AylarVeRubler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monthNum = sc.nextInt();

        if (monthNum >= 1 && monthNum <= 3) {
            System.out.println("First");
        } else if (monthNum >= 4 && monthNum <= 6) {
            System.out.println("Second");
        } else if (monthNum >= 7 && monthNum <= 9) {
            System.out.println("Third");
        } else if (monthNum >= 10 && monthNum <= 13) {
            System.out.println("Fourth");
        }
    }
}
