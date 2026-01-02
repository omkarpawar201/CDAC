import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class e {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    break;
                }
            }
        }

        int[] arr = new int[list.size()];
        int i = 0;

        for (Integer integer : list) {
            arr[i] = integer;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2 };

        int[] arr3 = intersection(arr1, arr2);
        
        System.out.println();
        System.out.println(Arrays.toString(arr3));
    }
}
