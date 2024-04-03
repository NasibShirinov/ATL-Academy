package lesson4_ObjectsAndMethods;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Emeliyyasi secin + "
                + "\n 1. Toplama"
                + "\n 2. Cixma"
                + "\n 3. Vurma"
                + "\n 4. Bolme");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();



        switch (menu) {
            case 1:
                System.out.println("ilk ededi daxil edin");
                int num1 = sc.nextInt();
                System.out.println("ikinci ededi daxil edin");
                int num2 = sc.nextInt();
                topla(num1, num2);
            case 2:
                System.out.println("ilk ededi daxil edin");
                num1 = sc.nextInt();
                System.out.println("ikinci ededi daxil edin");
                num2 = sc.nextInt();
                cixma(num1, num2);
            case 3:
                System.out.println("ilk ededi daxil edin");
                num1 = sc.nextInt();
                System.out.println("ikinci ededi daxil edin");
                num2 = sc.nextInt();
                vurma(num1, num2);
            case 4:
                System.out.println("ilk ededi daxil edin");
                num1 = sc.nextInt();
                System.out.println("ikinci ededi daxil edin");
                num2 = sc.nextInt();
                bolme(num1, num2);
        }

//        if (menu == 1) {
//            System.out.println("ilk ededi daxil edin");
//            int num1 = sc.nextInt();
//            System.out.println("ikinci ededi daxil edin");
//            int num2 = sc.nextInt();
//            topla(num1, num2);
//        } else if (menu == 2) {
//            System.out.println("ilk ededi daxil edin");
//            int num1 = sc.nextInt();
//            System.out.println("ikinci ededi daxil edin");
//            int num2 = sc.nextInt();
//            cixma(num1, num2);
//        } else if (menu == 3) {
//            System.out.println("ilk ededi daxil edin");
//            int num1 = sc.nextInt();
//            System.out.println("ikinci ededi daxil edin");
//            int num2 = sc.nextInt();
//            vurma(num1, num2);
//        } else if (menu == 4) {
//            System.out.println("ilk ededi daxil edin");
//            int num1 = sc.nextInt();
//            System.out.println("ikinci ededi daxil edin");
//            int num2 = sc.nextInt();
//            bolme(num1, num2);
//        } else if (menu == 5) {
//            System.out.println("Belə bir seçim yoxdur");
    }

    static void topla (int num1, int num2) {
       int sum = num1 + num2;
        System.out.println(sum);
    }
    static void cixma (int num1, int num2) {
        int cixma = num1 - num2;
        System.out.println(cixma);
    }

    static void vurma (int num1, int num2) {
        int hasil = num1 * num2;
        System.out.println(hasil);
    }

    static void bolme (int num1, int num2) {
        int bolgu = num1 / num2;
        System.out.println(bolgu);
    }
}
