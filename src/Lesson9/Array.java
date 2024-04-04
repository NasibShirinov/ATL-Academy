package Lesson9;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        int [][] nums = {{1,2,3}, {4,5,6}};
        int [][] array = new int[num][num];


        int counter = 0;
        for (int row = 0; row < num; row++) {
            for (int column = 0; column < num; column++) {
                array[row][column] = counter++;
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
