package lesson17;

import java.util.Scanner;

public class EnBoyukElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size daxil et");
        int size = sc.nextInt();
        int[] arrayOfNums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(i + "-ci reqemi daxil et");
            int nums = sc.nextInt();
            arrayOfNums[i] = nums;
        }

        int number = 0;
        int index = 0;
        for (int j = 0; j < arrayOfNums.length; j++) {
            if (j != arrayOfNums[arrayOfNums.length - 1]){
                if (number < arrayOfNums[j]) {
                    number = arrayOfNums[j];
                    index = j + 1;
                }
            }
        }
        System.out.println(number + " " + index);
    }

}
