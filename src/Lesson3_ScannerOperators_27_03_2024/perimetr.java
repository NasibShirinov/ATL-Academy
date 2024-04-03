package Lesson3_ScannerOperators_27_03_2024;

import java.util.Scanner;

public class perimetr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();

        int result = (height + width) * 2;
        System.out.println(result);
    }
}
