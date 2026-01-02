public class r {

    public static int[] max(int[] nums) {
        int[] arr = new int[2];
        int max = nums[0];
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        arr[0] = max;
        arr[1] = maxIndex;

        return arr;
    }

    public static int dominantIndex(int[] nums) {
        int[] arr = max(nums);
        int max = arr[0];
        int maxIndex = arr[1];

        System.out.println();
        System.out.println(max);

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        // int[] arr1 = {3, 6, 1, 0};
        int[] arr2 = { 0, 0, 0, 1 };

        // System.out.println(dominantIndex(arr1)); // Output: 1
        System.out.println(dominantIndex(arr2)); // Output: -1
    }
}
