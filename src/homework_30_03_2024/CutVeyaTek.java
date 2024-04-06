package homework_30_03_2024;

import java.util.Scanner;

public class CutVeyaTek {
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
