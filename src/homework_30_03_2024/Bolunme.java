package homework_30_03_2024;

import java.util.Scanner;

public class Bolunme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double limit = Math.pow(10, 9);

        if (a >= 1 && b <= limit) {
            if (a % b != 0) {
                System.out.print(a / b + " ");
                System.out.print(a % b);
            } else {
                System.out.println("Divisible");
            }
        }
    }
}
