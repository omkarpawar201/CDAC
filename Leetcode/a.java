import java.util.Arrays;

class a {
    public static int maxElement(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // public static boolean containsDuplicate(int[] nums) {
    // int max = maxElement(nums);
    // System.out.println(max);
    // boolean flag = false;

    // int[] temp = new int[max + 1];

    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] > 0) {
    // temp[nums[i]]++;
    // }
    // }

    // for (int i = 0; i < temp.length; i++) {
    // if (temp[i] > 1) {
    // flag = true;
    // }
    // }

    // System.out.println(Arrays.toString(temp));
    // return flag;
    // }

    // public static boolean containsDuplicate(int[] nums) {
    // int n = nums.length;
    // Arrays.sort(nums);
    // for (int i = 1; i < n; i++) {
    // if (nums[i - 1] == nums[i]) {
    // return true;
    // }
    // }
    // return false;
    // }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int j = 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 1; i < n; i++) {
            int abs = Math.abs(j - i);
            System.out.println(abs);
            
            if (nums[j] == nums[i] && i != j && Math.abs(j - 1) <= k) {
                return true;
            }
            j++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 2, 3 };
        // int[] arr = { 6, 5, 5 };
        System.out.println();
        System.out.println(arr.length);

        boolean flag = containsNearbyDuplicate(arr, 2);

        System.out.println("Majority element : " + flag);
    }
}