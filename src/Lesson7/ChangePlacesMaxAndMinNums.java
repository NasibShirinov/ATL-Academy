package Lesson7;

public class ChangePlacesMaxAndMinNums {
    public static void main(String[] args) {
        int [] nums = {4, 9, 8, 2, 10};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
//            nums[i] += max;
            if (max < nums[i]) {
//                max = nums[i];
//                nums[i] = min;
                max = i;
            }
            if (min > nums[i]) {
//                min = nums[i];
//                nums[i] = max;
                min = i;
            }


        }

        System.out.println("\nmax: " + max);
        System.out.println("min: " + min);

        int temp = nums [max];
        nums [max] = nums [min];
        nums [min] = temp;

        for (int num: nums) {
            System.out.print(num + ",");
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print("\n" + nums[i] + ",");
//        }

//        for (int i = 0; i < nums.length; i++) {
//
//
//            System.out.print(nums[i] + ",");
//        }

    }
}
