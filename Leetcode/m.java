import java.util.Arrays;

public class m {

    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int secMax(int[] nums) {
        int max = max(nums);
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (secMax < nums[i] && nums[i] < max) {
                secMax = nums[i];
            }
        }
        return secMax;
    }

    public static int maximumProduct(int[] nums) {

        if (nums.length == 3) {
            int prod = 1;

            for (int i : nums) {
                prod *= i;
            }
            return prod;
        } else {
            Arrays.sort(nums);

            int length = nums.length;
            int prod1 = nums[length - 1] * nums[length - 2] * nums[length - 3];
            int prod2 = nums[0] * nums[1] * nums[length - 1];

            return Math.max(prod1, prod2);
        }

    }

    public static void main(String[] args) {
        int[] arr = { -100, -98, -1, 2, 3, 4 }; 

        int num = maximumProduct(arr);

        System.out.println();
        System.out.println("Product : " + num);
    }
}