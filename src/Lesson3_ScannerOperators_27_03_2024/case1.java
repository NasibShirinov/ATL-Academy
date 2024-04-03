package Lesson3_ScannerOperators_27_03_2024;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
//        System.out.println(number);


        int num1 = number / 10;
        int num2 = number % 10;
//        int num2 = number % num1;
//        System.out.println("first part: " + num1);
//        num2 = num1 + num2;
//        System.out.println("second part: " + num2);

        System.out.println(num1 + " " + num2);
    }
}