package lesson4_ObjectsAndMethods;

import java.util.Scanner;

public class GirisVerilenleri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qradus = sc.nextInt();

        if (qradus <= 0) {
            System.out.println("Ice");
        } else if (qradus > 0) {
            System.out.println("Water");
        }
    }
}
