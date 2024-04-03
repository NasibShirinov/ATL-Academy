package Lesson3_ScannerOperators_27_03_2024;

import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if (1 <= grade && grade <=3) {
            System.out.println("Initial");
        } else if (4 <= grade && grade <= 6) {
            System.out.println("Average");
        } else if (7 <= grade && grade <= 9) {
            System.out.println("Sufficient");
        } else if (10 <= grade && grade <= 12) {
            System.out.println("High");
        } else {
            System.out.println("not right");
        }
    }
}
