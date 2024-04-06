package homework_30_03_2024;

import java.util.Scanner;

public class EyniIshareliEdedler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double limit = Math.pow(10, 9);

        if (num1 <= limit && num2 <= limit){
            if (num1 > 0 && num2 > 0) {
                System.out.println(1);
            } else if (num1 < 0 && num2 < 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
