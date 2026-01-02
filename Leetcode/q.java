public class q {
    public static int dominantIndex(int[] nums) {
        int largestElement = 0;
        for (int i = 1; i < nums.length; i++) {
            largestElement = nums[0];
            if (largestElement < nums[i]) {
                largestElement = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (2 * nums[i] <= largestElement) {
                return i;
            }
            
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int c = dominantIndex(a);
        System.out.println();
        System.out.println(c);
    }
}
