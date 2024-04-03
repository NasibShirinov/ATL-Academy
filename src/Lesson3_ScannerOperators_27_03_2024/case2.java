package Lesson3_ScannerOperators_27_03_2024;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of people");
        int numOfPeople = sc.nextInt();
        System.out.println("input number of apples");
        int numOfApples = sc.nextInt();

        int result = numOfApples / numOfPeople;
        System.out.println(result);

    }
}
