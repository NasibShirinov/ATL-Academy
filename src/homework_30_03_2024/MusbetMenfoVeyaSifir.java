package homework_30_03_2024;

import java.util.Scanner;

public class MusbetMenfoVeyaSifir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double limit = Math.pow(10, 9);

        if (n <= limit) {
            if (n > 0) {
                System.out.println("Positive");
            } else if (n < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
