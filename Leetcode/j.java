public class j {
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
        int secMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (secMax < nums[i] && nums[i] < max) {
                secMax = nums[i];
            }
        }
        return secMax;
    }

    public static int thirdMax(int[] nums) {
        int max = max(nums);
        int secMax = secMax(nums);
        int thirdMax = Integer.MIN_VALUE;

        if (nums.length <= 2) {
            return max;
        }

        for (int i = 0; i < nums.length; i++) {
            if (thirdMax < nums[i] && nums[i] < max && nums[i] < secMax) {
                thirdMax = nums[i];
            }
        }

        if (thirdMax == 0 || thirdMax == secMax) {
            return max;
        } else
            return thirdMax;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 5, 3, 5 };

        System.out.println();
        System.out.println(max(arr));
        System.out.println(secMax(arr));
        System.out.println(thirdMax(arr));
    }
}
