package Lesson7;

public class ArraySum {
    public static void main(String[] args) {
        int [] nums = {2, 5, 4, 4};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        int pow = 1;
        for (int i = 0; i < nums.length; i++) {
            pow *= nums[i];
        }
        System.out.println(pow);
    }
}
