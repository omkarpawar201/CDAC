package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Remove_Duplicates_from_Sorted_Array_26 {
    public static int removeDuplicates(int[] nums) {
        // Set<Integer> set = new TreeSet<>();

        // for (Integer integer : nums) {
        // set.add(integer);
        // }

        // return set.size();
        int j = 1;
        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] != nums[j])) {
                lst.add(nums[i]);
            }
            j++;
        }

        if (nums[nums.length - 2] != nums[nums.length - 1]) {
            lst.add(nums[nums.length - 1]);
        }

        System.out.println(lst);
        return lst.size();
    }

    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println("Number of non : " + removeDuplicates(array));
    }
}
