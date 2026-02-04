package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i : nums) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
            if (hmap.get(i) > nums.length / 2) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println("Array : " + majorityElement(arr));
    }
}
