package Problems.Arrays;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights)); // 3
        int[] heights2 = {5, 1, 2, 3, 4};
        System.out.println(heightChecker(heights2)); // 5
        int[] heights3 = {1, 2, 3, 4, 5};
        System.out.println(heightChecker(heights3)); // 0
    }

    public static int heightChecker(int[] heights) {
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sorted[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
