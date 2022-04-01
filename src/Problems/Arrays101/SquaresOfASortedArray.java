package Problems.Arrays101;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(sortedSquares(nums));// 0,1,9,16,100
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
