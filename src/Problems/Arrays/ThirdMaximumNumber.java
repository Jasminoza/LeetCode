package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums)); // 1
        int[] nums2 = {1, 2};
        System.out.println(thirdMax(nums2)); // 2
        int[] nums3 = {2, 2, 3, 1};
        System.out.println(thirdMax(nums3)); // 1
        int[] nums4 = {5, 4, 3, 2, 1};
        System.out.println(thirdMax(nums4)); // 3
    }

    public static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Integer.max(nums[0], nums[1]);
        }

        int third = 0;

        if (nums.length >= 3) {
            Arrays.sort(nums);
            ArrayList<Integer> lst = new ArrayList<>();
            for (int num : nums) {
                if (!lst.contains(num)) {
                    lst.add(num);
                }
            }
            if (lst.size() == 1) {
                return lst.get(0);
            }

            third = (lst.size() >= 3 ? lst.get(lst.size() - 3) : Integer.max(lst.get(0), lst.get(1)));

        }
        return third;
    }
}
