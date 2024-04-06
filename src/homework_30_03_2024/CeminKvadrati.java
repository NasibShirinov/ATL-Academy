package homework_30_03_2024;

import java.util.Scanner;

public class CeminKvadrati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        String numSring = Integer.toString(number);

        char firstNum = numSring.charAt(0);
        char secondNum = numSring.charAt(1);

        int num1 = Integer.parseInt(String.valueOf(firstNum));
        int num2 = Integer.parseInt(String.valueOf(secondNum));

        int result = (num1 + num2) * (num1 + num2);
        System.out.println(result);

    }
}
