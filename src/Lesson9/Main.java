package Lesson9;

public class Main {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("Before value: " + num);
        newNum(5);
        System.out.println("After value: " + num);
        System.out.println(num);
    }
    public static void newNum (int num) {
        num = 8;
        System.out.println("num in newNum method: " + num);
    }
}
