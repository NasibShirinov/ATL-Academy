package Lesson10;

import java.util.Scanner;

public class CeminBolunmesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        double lim = Math.pow(10, 8);

//        long limit = number (number <= lim);
        long sum = 0;
//        for (int i = 1; i <= k; i++) {
//            sum += i;
//            if (sum % k == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

        int i = 0;
        while (i > 0) {
            sum += i;
            if (sum % k == 0) {
                System.out.println(i);
                break;
            }
        i++;
        }
    }
}
