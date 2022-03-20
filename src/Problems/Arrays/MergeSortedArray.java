package Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        int[] nums3 = {1, 2, 3};
        m = 1;
        int[] nums4 = {};
        n = 0;
        merge(nums3, m, nums4, n);
        System.out.println(Arrays.toString(nums3));
        int[] nums5 = {0};
        m = 0;
        int[] nums6 = {1};
        n = 1;
        merge(nums5, m, nums6, n);
        System.out.println(Arrays.toString(nums5));
        int[] nums7 = {1};
        m = 1;
        int[] nums8 = {0};
        n = 0;
        merge(nums7, m, nums8, n);
        System.out.println(Arrays.toString(nums7));
        int[] nums9 = {4, 0, 0, 0, 0, 0};
        m = 1;
        int[] nums10 = {1, 2, 3, 5, 6};
        n = 5;
        merge(nums9, m, nums10, n);
        System.out.println(Arrays.toString(nums9));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return;
        }

        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        List<Integer> fullList = new ArrayList<>(m+n);
        for (int i = 0; i < m; i++) {
            fullList.add(nums1[i]);
        }

        for (int i = 0; i < n; i++) {
            fullList.add(nums2[i]);
        }

        Collections.sort(fullList);

        for (int i = 0; i < m+n; i++) {
            nums1[i] = fullList.get(i);
        }
    }

}

