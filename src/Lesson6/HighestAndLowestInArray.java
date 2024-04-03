package Lesson6;

import java.util.Scanner;

public class HighestAndLowestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

//        int[] nums = {5, 8, 7, 9, 1};
        int currentArray = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[0] < numbers[i]) {
                currentArray = numbers[i];
            }
        }
        System.out.println("highest is: " + currentArray);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[0] > numbers[i]) {
                currentArray = numbers[i];
            }
        }

        System.out.println("lowest is " + currentArray);
    }
}
