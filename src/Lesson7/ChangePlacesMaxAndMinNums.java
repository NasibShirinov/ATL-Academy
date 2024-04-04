package Lesson7;

public class ChangePlacesMaxAndMinNums {
    public static void main(String[] args) {
        int [] nums = {4, 9, 8, 2, 10};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }

        int max = nums[0]; // 0 beraber edib bax
        int min = nums[0];  // 0 beraber edib bax

        for (int i = 0; i < nums.length; i++) {
//            nums[i] += max;
            if (max < nums[i]) {
//                max = nums[i]; // 11 setrde yazilandan sonra bunlari yoxla
//                nums[i] = min; // 11 setrde yazilandan sonra bunlari yoxla
                max = i;
            }
            if (min > nums[i]) {
//                min = nums[i]; // 11 setrde yazilandan sonra bunlari yoxla
//                nums[i] = max; // 11 setrde yazilandan sonra bunlari yoxla
                min = i;
            }


        }

//        System.out.println("\nmax: " + max);
//        System.out.println("min: " + min);

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
