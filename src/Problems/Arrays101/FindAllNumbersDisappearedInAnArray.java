package Problems.Arrays101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums)); // 5, 6
        int[] nums2 = {1, 1};
        System.out.println(findDisappearedNumbers(nums2)); // 2
        int[] nums3 = {4, 3, 2, 7, 7, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums3)); // 5, 6, 8

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        if (n == 1) {
            arr.add(nums[0]);
            return arr;
        }

        List<Integer> arrNoDuplicates = new ArrayList<>();
        int numerator = 1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (!arrNoDuplicates.contains(nums[i])) {
                arrNoDuplicates.add(nums[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arrNoDuplicates.contains(numerator)) {
                numerator++;
            } else {
                arr.add(numerator);
                numerator++;
            }
        }

        return arr;
    }
}
