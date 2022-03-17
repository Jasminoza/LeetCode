package Problems.Easy;

/**
 * Given an integer array nums and an integer k, return the number of pairs (i, j)
 * where i < j such that |nums[i] - nums[j]| == k.
 * <p>
 * The value of |x| is defined as:
 * <p>
 * x if x >= 0.
 * -x if x < 0.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,2,1], k = 1
 * Output: 4
 * Explanation: The pairs with an absolute difference of 1 are:
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * - [1,2,2,1]
 * Example 2:
 * <p>
 * Input: nums = [1,3], k = 3
 * Output: 0
 * Explanation: There are no pairs with an absolute difference of 3.
 * Example 3:
 * <p>
 * Input: nums = [3,2,1,5,4], k = 2
 * Output: 3
 * Explanation: The pairs with an absolute difference of 2 are:
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 * - [3,2,1,5,4]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * 1 <= k <= 99
 */

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int k = 1;
        System.out.println(countKDifference(nums, k)); // 4
        int[] nums2 = {1, 3};
        k = 3;
        System.out.println(countKDifference(nums2, k)); // 0
        int[] nums3 = {3, 2, 1, 5, 4};
        k = 2;
        System.out.println(countKDifference(nums3, k)); // 3

    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j] + k) {
                    count++;
                }
            }
        }
        return count;
    }

}
