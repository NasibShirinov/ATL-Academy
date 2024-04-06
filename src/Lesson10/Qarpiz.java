package Lesson10;

import java.util.Scanner;

public class Qarpiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int otuzMin = 30000;
        int qarpizSayi = sc.nextInt();

        int[] cekiler = new int[qarpizSayi];

        for (int i = 0; i < cekiler.length; i++) {
//                int qarpizCeki = sc.nextInt();
                cekiler[i] = sc.nextInt();
            }

//            for (int n = 0; n < cekiler.length; n++) {
//                System.out.print(cekiler[n] + ", ");
//            }

        if (qarpizSayi == 0 || qarpizSayi == 1) {
            System.out.println("Ooops!");
        } else {
            int min = cekiler[0];
            int max = cekiler[0];

            for (int k = 1; k < cekiler.length; k++) {
                if (min > cekiler[k]) {
                    min = cekiler[k];
                }
            }
            // lowest
            System.out.print(min + " ");


            for (int j = 1; j < cekiler.length; j++) {
                if (max < cekiler[j]) {
                    max = cekiler[j];
                }
            }
            // highest
            System.out.print(max);
        }
    }
}
