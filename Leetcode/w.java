import java.util.ArrayList;
import java.util.List;

public class w {
    public static List<List<Integer>> threeSum() {

        int i = 0, j = 1, k = 2;
        List<Integer> list = new ArrayList<>();
        int[] nums = { -1, 0, 1, 2, -1, -4 };

        for (int k2 = 0; i < nums.length - 2; k2++) {
            if (i < nums.length - 2 && j < nums.length - 1 && k < nums.length) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                }
            }
            k++;

            if (k == nums.length) {
                j++;
                k = j + 1;
            }
            if (j == nums.length - 1) {
                i++;
                j = i + 1;
                k = j + 1;
            }
        }

        for (int l : list) {
            System.out.println(l);
        }

        return null;

    }

    public static void main(String[] args) {
        int i = 0, j = 1, k = 2;
        List<List<Integer>> list1 = new ArrayList<>();

        int[] nums = { -1, 0, 1, 2, -1, -4 };
        // int[] nums = { 0, 1, 1 };
        // int[] nums = { 0, 0, 0 };

        for (int k2 = 0; i < nums.length - 2; k2++) {
            if (i < nums.length - 2 && j < nums.length - 1 && k < nums.length) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    list1.add(list);
                }
            }
            k++;

            if (k == nums.length) {
                j++;
                k = j + 1;
            }
            if (j == nums.length - 1) {
                i++;
                j = i + 1;
                k = j + 1;
            }
        }

        // for (int l : list) {
        System.out.println();
        System.out.println(list1);
        // }
    }
}
