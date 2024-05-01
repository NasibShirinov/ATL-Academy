package lesson18;

import java.util.Random;
import java.util.Scanner;

public class MorskoyBoy {
    public static void main(String[] args) {
        // Создаем двумерный массив 6x6
        char[][] grid = new char[6][6];

        // Заполняем массив символами '-' в каждой ячейке
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '-';
            }
        }

        // Заполняем номера строк и столбцов
        for (int i = 0; i < grid.length; i++) {
            grid[i][0] = (char) ('0' + i); // Номер строки
            grid[0][i] = (char) ('0' + i); // Номер столбца
        }

        // Выводим массив на экран
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " | ");
            }
            System.out.println();
        }
//        Scanner sc = new Scanner(System.in);
//        Random random = new Random(6);
//        int randomNum1 = random.nextInt(1,6);
//        int randomNum2 = random.nextInt(1,6);
//        System.out.println(randomNum1 + " " + randomNum2);
//        int [][] battleSheet = new int[6][7];
//        System.out.println(battleSheet.length);
//
//        for (int i = 0; i <= battleSheet.length; i++) {
//            System.out.print(i + " " + "|" + " ");
//        }
//
//        for (int j = 0; j < battleSheet.length; j++) {
//            System.out.println(j + " " + "|" + " ");
//        }


//
//        for (int j = 1; j < battleSheet.length; j++) {
//            if ((j == (battleSheet.length - 1)) || (j == (battleSheet.length - 2)) || (j == (battleSheet.length - 3)) || (j == (battleSheet.length - 4)) || (j == (battleSheet.length - 5))) {
//                System.out.println(" ");
//            } else {
//                System.out.println("-" + " " + "|" + " ");
//            }
//            System.out.print(j + " " + "|" + " ");
//            for (int k = 1; k < battleSheet.length; k++) {
//                System.out.print("-" + " " + "|" + " ");
////                for (int n = 0; n < battleSheet.length; n++) {
////                    System.out.print(n + " " + "|" + " ");
////                }
//            }
//        }
//
//        do {
//
//        } while (true);
    }
}
