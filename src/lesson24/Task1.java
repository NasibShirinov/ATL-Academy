package lesson24;

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 3metod
//        1 string 1 int 1
//        Scanner sc = new Scanner(System.in);
//        String parameter1 = sc.next();
        requiredNonNull("asfa");
        requiredNonNull(Integer.valueOf(null));
    }

    static void requiredNonNull (String parameter) {
        if (parameter.equals(null)) {
            throw new CustomNullPointerExeption();
        }
    }

    static void requiredNonNull (Integer parameter) {
        if (parameter.equals(null)) {
            throw new CustomNullPointerExeption();
        }
    }

    static void requiredNonNull (LocalDate parameter) {
        if (parameter.equals(null)) {
            throw new CustomNullPointerExeption();
        }
    }
}
