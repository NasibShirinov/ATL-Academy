package Lesson6;

import java.util.Scanner;

public class KvadratlarinCemi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double limit = Math.pow(10, 6);

        int sum = 0;
        if (number >= 1 && number <= limit) {
            for (int i = 1; i <= number; i++) {
                sum += (i * i);
            }
            System.out.println(sum);
        }
    }
}
