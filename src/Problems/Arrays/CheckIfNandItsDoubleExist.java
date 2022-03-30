/**
 * Given an array arr of integers, check if there exists two integers N
 * and M such that N is the double of M ( i.e. N = 2 * M).
 * <p>
 * More formally check if there exists two indices i and j such that :
 * <p>
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * Example 2:
 * <p>
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * Example 3:
 * <p>
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 */

package Problems.Arrays;

public class CheckIfNandItsDoubleExist {

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr)); // true
        int[] arr2 = {7, 1, 14, 11};
        System.out.println(checkIfExist(arr2)); // true
        int[] arr3 = {3, 1, 7, 11};
        System.out.println(checkIfExist(arr3)); // false
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] % 2 == 0 && arr[j] == (arr[i] / 2) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
