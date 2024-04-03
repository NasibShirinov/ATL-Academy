package lesson5_for_MethodsOofString;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 8; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 7; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k < 8; k++) {
//                if (k > i) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

//

//        for (int i = 0; i < 8; i++) {
//            for (int j = 8; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 7; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
