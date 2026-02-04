package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Single_Number_136 {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i : nums) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> i : hmap.entrySet()) {
            if (i.getValue() == 1) {
                return i.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };

        System.out.println("Array : " + majorityElement(arr));
    }
}
