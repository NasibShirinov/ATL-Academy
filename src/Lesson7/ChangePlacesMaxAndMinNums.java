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
                max = nums[i];
                nums[i] = min;
            }
            if (min > nums[i]) {
                min = nums[i];
                nums[i] = max;
            }


        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print("\n" + nums[i] + ",");
//        }
        System.out.println("\nmax: " + max);
        System.out.println("min: " + min);

//        for (int i = 0; i < nums.length; i++) {
//
//
//            System.out.print(nums[i] + ",");
//        }

    }
}
