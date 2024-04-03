package Lesson6;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double limit = Math.pow(10, 9);

//        if (num >= 0 && num <= 2 * limit) {
////            System.out.println(num);
//            String numStr = Integer.toString(num);
//            System.out.println(numStr.length());
//        }

        int counter = 0;
        do {
            num /= 10;
            counter++;
        } while (num > 0);

        System.out.println(counter);

//        String numStr = Integer.toString(num);
//        System.out.println(numStr.length());
    }
}
