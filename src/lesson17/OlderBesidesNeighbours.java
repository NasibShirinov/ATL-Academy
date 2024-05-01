package lesson17;

import java.util.Scanner;

public class OlderBesidesNeighbours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size daxil et");
        int size = sc.nextInt();
        int [] arrayOfNums = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            System.out.println(i + "-ci reqemi daxil et");
            int nums = sc.nextInt();
            arrayOfNums[i] = nums;
        }

        for (int j = 0; j < arrayOfNums.length; j++) {
            if (j != arrayOfNums.length - 1 && j != 0) {
                if (arrayOfNums[j] > arrayOfNums[j + 1] && arrayOfNums[j] > arrayOfNums[j - 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
