package Lesson10;

import java.util.Scanner;

public class IlanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        long finalPoint = (long) row * row;

        for (int i = 0; i < finalPoint; i++) {
            if (i == 3) {
                System.out.print("\n");
                for (int j = i + 1; j <= finalPoint; j++) {
                    System.out.println(j);
                }
            } else if (i <= 3) {
                System.out.print(i + 1);
            }
        }
    }
}
