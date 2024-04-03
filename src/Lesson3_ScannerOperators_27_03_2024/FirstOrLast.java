package Lesson3_ScannerOperators_27_03_2024;

import java.util.Scanner;

public class FirstOrLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        int firstNum = number / 100;
        int thirdNum = number % 10;
//        int thirdNum = number % 100;
//        int secondNum = thirdNum / 10;
//        thirdNum = thirdNum % 10;

        if(number >= 100 && number <= 999){
            if (firstNum > thirdNum) {
                System.out.println(firstNum);
            } else if (thirdNum > firstNum) {
                System.out.println(thirdNum);
            } else {
                System.out.println(firstNum + "=" + thirdNum);
            }
        } else {
            System.out.println("3 rəqəmli ədəd girin");
        }
    }
}
