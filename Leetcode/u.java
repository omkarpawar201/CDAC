public class u {
    public static boolean isMonotonic(int[] nums) {
        System.out.println();

        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }

            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
        }

        return inc || dec;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };
        System.out.println(isMonotonic(arr));
    }
}
