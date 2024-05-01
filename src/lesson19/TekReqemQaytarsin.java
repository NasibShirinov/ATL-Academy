package lesson19;

import java.util.*;

public class TekReqemQaytarsin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input entry number");
        int num1 = sc.nextInt();
        System.out.println("Input final number");
        int num2 = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
    }
}
