package Problems.Easy;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i+1; j--) {
                    arr[j] = arr[j - 1];
                }
            }
            if (arr[i] == 0 && i < arr.length-1) {
                arr[i + 1] = 0;
                i++;
            }
        }
    }
}
