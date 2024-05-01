package Lesson22;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = sc.nextByte();
        Random randomNums = new Random(size);
        int [] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNums.nextInt(size);
        }
        for (int num: numbers) {
            System.out.print(num + ", ");
        }
        System.out.println("");

        int number = 0;
        for (int j = 0; j < numbers.length - 1; j++) {
            for (int k = 0; k < numbers.length - j - 1; k++) {
                if (numbers[k] > numbers[k+1]) {
                    number = numbers[k];
                    numbers[k] = numbers[k+1];
                    numbers[k+1] = number;
//                    number = numbers[j];
                }
//                else if (numbers[j] < numbers[j-1]) {
//                    number = numbers[j];
//                    numbers[j] = numbers[j-1];
//                    numbers[j-1] = number;
//                }
            }
        }
        for (int num: numbers) {
            System.out.print(num + ", ");
        }
//        System.out.println(number);
    }
}
