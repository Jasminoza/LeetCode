package Problems.Arrays;

public class findNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums)); //2
        int[] nums2 = {555, 901, 482, 1771};
        System.out.println(findNumbers(nums2)); //1
    }

    public static int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            String numStr = num + "";
            if (numStr.length() % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
