package lesson5_for_MethodsOofString.lesso5_homework;

import java.util.Scanner;

public class DuzbucaqlininSahesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eni = sc.nextInt();
        int uzunluq = sc.nextInt();

        if (eni <= 1000 && uzunluq <= 1000) {
            int sahe = eni * uzunluq;
            System.out.println(sahe);
        }
    }
}
