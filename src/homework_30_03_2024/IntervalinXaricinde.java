package homework_30_03_2024;

import java.util.Scanner;

public class IntervalinXaricinde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        double limit = Math.pow(10, 9);

        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();


        if (x >= limit1 && x <= limit2 && limit2 < limit && x < limit) {
            System.out.println("IN");
        } else {
            System.out.println("OUT");
        }
    }
}
