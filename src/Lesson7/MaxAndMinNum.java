package Lesson7;

import java.util.Scanner;

public class MaxAndMinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size");
        int size = sc.nextInt();

        int[] numbers = new int [size];

       for (int i = 0; i < numbers.length; i++) {
           System.out.println("Input number " + (i + 1));
           int num = sc.nextInt();
           numbers[i] = num;
       }
       for (int j = 0; j < numbers.length; j++){
           System.out.print(numbers[j] + " ");
       }

       int max = numbers[0];
       int min = numbers[0];
       for (int k = 1; k < numbers.length; k++) {
           if (max < numbers[k]) {
               max = numbers[k];
           }
           if (min > numbers[k]) {
               min = numbers[k];
           }
       }
        System.out.println("\nmax is: " + max);
        System.out.println("min is: " + min);
    }
}

//        for (int k = 1; k < numbers.length; k++) {
//            if (min > numbers[k]) {
//                min = numbers[k];
//            }
//        }

