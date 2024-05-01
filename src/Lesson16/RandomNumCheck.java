package Lesson16;

import java.util.Scanner;

public class RandomNumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rəqəmüvi gir brat");

        int compNum = (int) (Math.random() * 100);

        while (true) {
            int myNum = sc.nextInt();
            if (myNum == compNum) {
                System.out.println("Sənə 1 şiş lülə");
                break;
            } else if (myNum < compNum) {
                System.out.println("Artır brat");
                if (myNum < 15) {
                    System.out.println("Artırdaaa qardaşım, bu nə rəqəmlərdi girirsən");
                }
            } else if (myNum > compNum) {
                System.out.println("Çox getdüne brat, azalt");
            }
        }

    }
}
