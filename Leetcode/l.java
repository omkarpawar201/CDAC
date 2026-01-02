public class l {

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
            int max = max(nums);
            int secMax = secMax(nums);
            int thirdMax = Integer.MIN_VALUE;
            int[] arr = new int[3];
            int k = 0;

            for (int i = 0; i < nums.length; i++) {
                if (thirdMax < nums[i] && nums[i] < secMax) {
                    thirdMax = nums[i];
                }
                if (nums[i] == max) {
                    arr[k] = nums[i];
                    k++;
                }
            }

            int prod = 1;
            if (arr.length == 3) {
                for (int i : arr) {
                    prod *= i;
                }
            }

            System.out.println();
            System.out.println("Max : " + max);
            System.out.println("SecMax : " + secMax);
            System.out.println("ThirdMax : " + thirdMax);

            if (prod != 0) {
                return prod;
            } else {

                return max * secMax * thirdMax;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { -100, -98, -1, 2, 3, 4 }; // 1, 2, 2, 3, 3, 4, 7, 8

        int num = maximumProduct(arr);

        System.out.println();
        System.out.println("Product : " + num);
    }
}
