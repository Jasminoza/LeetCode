package Problems.Arrays;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val)); // 2,2
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int countVal = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Integer.MAX_VALUE;
                countVal++;
            }
        }

        Arrays.sort(nums);

        return nums.length - countVal;
    }

}
