package Lesson16;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Heftenin gununun reqemini gir");
        System.out.println("Enter day of the week as \n0 - Sunday\n1 - Monday\n2 - Tuesday\n3 - Wednesday\n4 - Thursday\n5 - Friday\n6 - Saturday");
        int dayOfTheWeek = sc.nextInt();
//        System.out.println("Gunun isinin nomresini gir");
        System.out.println("Enter task of the day as\n0 - go to homework\n1 - go to course");
        int workOfTheDay = sc.nextInt();
        String[][] week = new String[7][2];

        switch (dayOfTheWeek) {
            case 0:
                week[0][0].equalsIgnoreCase("Sunday");
                System.out.println(week[0][0]);
                switch (workOfTheDay) {
                    case 0:
                        week[0][1].equalsIgnoreCase("go to homework");
                        System.out.println(week[0][1]);
                        break;
                    case 1:
                        week[0][1].equalsIgnoreCase("go to course");
                        System.out.println(week[0][1]);
                        break;
                }
                break;
            case 1:
                week[1][0].equalsIgnoreCase("Monday");
                System.out.println(week[1][0]);
                break;
            case 2:
                week[2][0].equalsIgnoreCase("Tuesday");
                System.out.println(week[2][0]);
                break;
            case 3:
                week[3][0].equalsIgnoreCase("Wednesday");
                System.out.println(week[3][0]);
                break;
            case 4:
                week[4][0].equalsIgnoreCase("Thursday");
                System.out.println(week[4][0]);
                break;
            case 5:
                week[5][0].equalsIgnoreCase("Friday");
                System.out.println(week[5][0]);
                break;
            case 6:
                week[6][0].equalsIgnoreCase("Saturday");
                System.out.println(week[6][0]);
                switch (workOfTheDay) {
                    case 0:
                        week[0][1].equalsIgnoreCase("go to homework");
                        System.out.println(week[0][1]);
                        break;
                    case 1:
                        week[0][1].equalsIgnoreCase("go to course");
                        System.out.println(week[0][1]);
                        break;
                }
                break;
        }

//        switch (workOfTheDay) {
//            case 0:
//                week[0][1] = "go to homework";
//                System.out.println(week[0][1].equalsIgnoreCase("go to homework"));
//                break;
//            case 1:
//                week[0][1] = "go to course";
//                System.out.println(week[0][1].equalsIgnoreCase("go to course"));
//                break;
//        }


    }
}
