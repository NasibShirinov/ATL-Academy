package Lesson22;

import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of the array:");
        int size = sc.nextInt();
        Random num = new Random(100);
        int [] arrayOfNums = new int[size];

        for (int i = 0; i < arrayOfNums.length; i++) {
            arrayOfNums[i] = num.nextInt(0, 100);
        }
        for (int number: arrayOfNums) {
            System.out.print(number + ", ");
        }
        System.out.println("");

        int min = 0;
        int temp = 0;
        for (int j = 0; j < arrayOfNums.length - 1; j++) {
            min = j;
            for (int k = j; k < arrayOfNums.length; k++) {
                if (arrayOfNums[min] > arrayOfNums[k]) {
                    min = k;
//                    arrayOfNums[k+1] = arrayOfNums[k];
//                    arrayOfNums[k] = min;
//                    arrayOfNums[0] = arrayOfNums[k+1];
//                    min = arrayOfNums[k];
                }
            }
            if (min != j) {
                temp = arrayOfNums[min];
                arrayOfNums[min] = arrayOfNums[j];
                arrayOfNums[j] = temp;
            }
        }
        for (int number: arrayOfNums) {
            System.out.print(number + ", ");
        }
    }
}
