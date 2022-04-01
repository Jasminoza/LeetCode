package Problems.Arrays101;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));

    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && nums[i] != Integer.MAX_VALUE && i != j) {
                    nums[j] = Integer.MAX_VALUE;
                    count++;
                }
            }
        }
        Arrays.sort(nums);
        return nums.length-count;
    }
}
