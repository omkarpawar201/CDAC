import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class d {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }

        System.out.println();
        System.out.println(set.size());
        int[] arr = new int[set.size()];
        int i = 0;

        for (Integer integer : set) {
            arr[i] = integer;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 9, 5 };
        int[] arr2 = { 9, 4, 9, 8, 4 };

        int[] arr3 = intersection(arr1, arr2);

        System.out.println(Arrays.toString(arr3));
    }
}
