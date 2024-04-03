package lesson5_for_MethodsOofString.lesso5_homework;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double limit = Math.pow(10, 9);

        if (number >= 1 && number <= limit) {
            if (number % 2 == 0) {
                System.out.println("EVEN");
            } else if (!(number % 2 == 0)) {
                System.out.println("ODD");
            }
        }
    }
}
