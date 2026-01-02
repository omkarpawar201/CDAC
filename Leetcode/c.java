import java.util.Arrays;

public class c {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0 };
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
