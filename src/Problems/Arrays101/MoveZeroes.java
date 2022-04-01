package Problems.Arrays101;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums)); // 1,3,12,0,0
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // 0
    }

    public static void moveZeroes(int[] nums) {
        for (int writePoiner = 0; writePoiner < nums.length - 1; writePoiner++) {
            for (int readPointer = 0; readPointer < nums.length - 1; readPointer++) {
                if (nums[readPointer] == 0) {
                    nums[readPointer] = nums[readPointer + 1];
                    nums[readPointer + 1] = 0;
                }
            }
        }
    }
}
