package lesson4_ObjectsAndMethods;

import java.util.Scanner;

public class IlinFesilleri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfMonth = sc.nextInt();

        if (numOfMonth == 1 || numOfMonth == 2 || numOfMonth == 12) {
            System.out.println("Winter");
        } else if (numOfMonth == 3 || numOfMonth == 4 || numOfMonth == 5) {
            System.out.println("Spring");
        } else if (numOfMonth == 6 || numOfMonth == 7 || numOfMonth == 8) {
            System.out.println("Summer");
        } else if (numOfMonth == 9 || numOfMonth == 10 || numOfMonth == 11) {
            System.out.println("Autumn");
        }

    }
}
//        switch (numOfMonth) {
//            case 1:
//                System.out.println("Winter");
//            case 2:
//                System.out.println("Winter");
//            case 3:
//                System.out.println("Spring");
//            case 4:
//                System.out.println("Spring");
//            case 5:
//                System.out.println("Spring");
//            case 6:
//                System.out.println("Summer");
//            case 7:
//                System.out.println("Summer");
//            case 8:
//                System.out.println("Summer");
//            case 9:
//                System.out.println("Summer");
//            case 10:
//                System.out.println("Summer");
//        }
