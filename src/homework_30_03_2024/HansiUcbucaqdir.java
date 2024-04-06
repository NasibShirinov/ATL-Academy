package homework_30_03_2024;

import java.util.Scanner;

public class HansiUcbucaqdir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if (side1 == side2 && side1 == side3 && side2 == side3) {
            System.out.println(1);
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
