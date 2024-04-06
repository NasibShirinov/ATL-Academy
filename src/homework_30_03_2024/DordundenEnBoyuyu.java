package homework_30_03_2024;

import java.util.Scanner;

public class DordundenEnBoyuyu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int [4];

        for (int i = 0; i < numbers.length; i++) {
            int num = sc.nextInt();
            numbers[i] = num;
        }

        int max = numbers[0];
        for (int k = 1; k < numbers.length; k++) {
            if (max < numbers[k]) {
                max = numbers[k];
            }
        }
        System.out.println(max);
    }
}
