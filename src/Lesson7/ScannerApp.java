package Lesson7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        String myString1 = sc.nextLine();
//        System.out.println(myString1);
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("input string");

//        sc.nextLine();
        String myString = sc.nextLine();
        System.out.println(myString);
        int myInt = sc.nextInt();
        System.out.println(myInt);
    }
}
