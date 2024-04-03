package Lesson6;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        int[] numbers = {1, 5, 7, 9, 11, 17, 19};
        int[] nums = {19, 8, 43, 1, 25, 26, 17, 42, 35, 65, 75, 95};
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.binarySearch(nums, 43));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 95) {
                System.out.println("nums [" + i + "] = " + nums[i]);
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time in mills: " + executionTime);
    }
}
