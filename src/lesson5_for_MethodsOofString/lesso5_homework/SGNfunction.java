package lesson5_for_MethodsOofString.lesso5_homework;

import java.util.Scanner;

public class SGNfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        double limit1 = Math.pow(-10, 9);
        double limit2 = Math.pow(10, 9);

        if (number >= limit1 && number <= limit2) {
            if (number < 0) {
                System.out.println("-1");
            } else if (number > 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
