import java.util.Arrays;

public class x {
    public static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };

        int[] arr2 = sortedSquares(arr);

        System.out.println(Arrays.toString(arr2));
    }
}
