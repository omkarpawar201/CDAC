import java.util.Arrays;

public class b {

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println();
        System.out.println(Arrays.toString(nums));

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[0] != nums[1]) {
                return nums[0];
            } else if (i == nums.length - 1 && nums[i] != nums[i - 1]) {
                return nums[i];
            } else if (i > 0 && i < nums.length - 1 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { -336, 513, -560, -481, -174, 101, -997, 40, -527, -784, -283, -336, 513, -560, -481, -174, 101,
                -997, 40, -527, -784, -283, 354 };
        int num = singleNumber(arr);
        System.out.println("unique : " + num);
    }
}
