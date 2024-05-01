package Lesson22;

public class SearchApp {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 9, 12, 14, 15, 18, 20, 23};
        int start = 0;
        int end = nums.length;
        int ourNum = 18;
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            int midIndex = (start + end) / 2;
            if (nums[midIndex] == ourNum) {
                step++;
                System.out.println(midIndex);
                System.out.println(step);
                break;
            } else if (nums[midIndex] > ourNum) {
                end = midIndex;
                step ++;
            } else if (nums[midIndex] < ourNum) {
                start = midIndex;
                step ++;
            }
        }
    }
}
