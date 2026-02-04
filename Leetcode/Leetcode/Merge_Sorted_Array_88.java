package Leetcode;

import java.util.Arrays;

public class Merge_Sorted_Array_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] array = new int[m + n];
        int i = 0, j = 0, k = 0;

        // System.out.println(array.length);

        for (int l = 0; l < array.length; l++) {
            if (i >= m || j >= n) {
                break;
            } else {
                if (nums1[i] <= nums2[j]) {
                    array[k] = nums1[i];
                    k++;
                    i++;
                } else if (nums1[i] >= nums2[j]) {
                    array[k] = nums2[j];
                    k++;
                    j++;
                }
            }
        }

        if (i >= m) {
            while (j < n) {
                array[k] = nums2[j];
                // System.out.println(array[k]);
                k++;
                j++;
            }
        }

        if (j >= n) {
            while (i < m) {
                array[k] = nums1[i];
                // System.out.println(array[k]);
                k++;
                i++;
            }
        }

        for (int k2 = 0; k2 < array.length; k2++) {
            nums1[k2] = array[k2];
        }
        // System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int m = 2, n = 4;
        int[] nums1 = { 1, 2, 0, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6, 9 };

        merge(nums1, m, nums2, n);

        System.out.println("Sorted array : " + Arrays.toString(nums1));

    }

}
