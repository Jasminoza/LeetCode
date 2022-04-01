package Problems.Arrays101;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * <p>
 * Recall that arr is a mountain array if and only if:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [2,1]
 * Output: false
 * Example 2:
 * <p>
 * Input: arr = [3,5,5]
 * Output: false
 * Example 3:
 * <p>
 * Input: arr = [0,3,2,1]
 * Output: true
 */

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = {2, 1};
        System.out.println(validMountainArray(arr));
        int[] arr2 = {3, 5, 5};
        System.out.println(validMountainArray(arr2));
        int[] arr3 = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr3));
        int[] arr4 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(validMountainArray(arr4));
    }

    public static boolean validMountainArray(int[] arr) {
        boolean valid = true;

        if (arr.length < 3) {
            return false;
        }

        if (arr[1] < arr[0]) {
            return false;
        }

        int mountainPeek = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            } else {
                mountainPeek = i;
                break;
            }
        }

        if (mountainPeek == -1) {
            return false;
        }


        if (mountainPeek > 0) {
            for (int i = mountainPeek; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    continue;
                } else {
                    valid = false;
                    return valid;
                }
            }
        }
        return valid;
    }
}
