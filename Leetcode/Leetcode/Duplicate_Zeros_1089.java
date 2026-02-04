package Leetcode;

import java.util.Arrays;

public class Duplicate_Zeros_1089 {
    // public static void duplicateZeros(int[] arr) {
    // int temp = 0;
    // int temp1 = 0;
    // for (int i = 0; i < arr.length - 2; i++) {
    // temp = temp1;
    // if (arr[i] == 0) {
    // temp = arr[i + 1];
    // arr[i + 1] = 0;
    // }
    // if (arr[i] == 0 && arr[i + 1] == 0) {
    // temp1 = arr[i + 2];
    // arr[i + 2] = temp;
    // }
    // }
    // }
    // 1, 0, 0, 2,

    public static void duplicateZeros(int[] arr) {

        int zeros = 0;
        int n = arr.length;

        // Count zeros
        for (int num : arr) {
            if (num == 0)
                zeros++;
        }

        // Traverse from end
        for (int i = n - 1; i >= 0; i--) {

            if (i + zeros < n) {
                arr[i + zeros] = arr[i];
            }

            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < n) {
                    arr[i + zeros] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };

        duplicateZeros(arr);
        System.out.println("Array : " + Arrays.toString(arr));
    }
}
