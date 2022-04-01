package Problems.Arrays101;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums))); //2,4,3,1. The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int counter = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[counter] = num;
                counter++;
            }
        }

        for (int num : nums)
            if (num % 2 != 0) {
                arr[counter] = num;
                counter++;
            }

        return arr;
    }
}
