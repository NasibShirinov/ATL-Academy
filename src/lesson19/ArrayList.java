package lesson19;

import java.util.*;

class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Collection<Integer> numsArrList = new ArrayList<Integer>();
        numsArrList = new ArrayList<Integer>();
        numsArrList.add(2);
        numsArrList.add(3);
        numsArrList.add(4);
        numsArrList.add(5);
        numsArrList.add(6);
        System.out.println(arrayIs(numsArrList,number));
//        List<Integer> numsList = new ArrayList<Integer>();

        // Stack de obyekt olmur
        // Heap de obyekt olur
        // Pool heap in icindedi
        // Pool da saxlanilanlar:
        // String a = "Nasib";
        // String b = "Nasib";
        // Heapde saxlanilar: String a = new String("Nasib");
    }

    public static String arrayIs(Collection<Integer> numsArrList, int num) {

        boolean answer =  numsArrList.contains(num);
        if (answer == true) {
            return "yes";
        } else {
            return "no";
        }
    }
}
