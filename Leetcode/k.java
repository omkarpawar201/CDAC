// Given a binary array nums, return the maximum number of consecutive 1's 
// in the array.

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2

class k {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int current_count = 0;
        int prev_count = 0;

        // if (nums.length == 1 && nums[0] == 0)
        //     return 0;

        // if (nums.length == 1 && nums[0] == 1)
        //     return 1;

        for (int i = 0; i < nums.length; i++) { // 1,1,0,1,1,1
            if (nums[i] == 1) {
                current_count++;
            }
            if (nums[i] == 0) {
                if (prev_count < current_count) {
                    prev_count = current_count;
                }
                current_count = 0;
            }
        }

        if (prev_count < current_count) {
            prev_count = current_count;
        }

        // if (prev_count > 0) {
        // prev_count = prev_count + 1;
        // }

        System.out.println();
        // System.out.println("max : " + (prev_count + 1));

        return prev_count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };

        System.out.println("max : " + findMaxConsecutiveOnes(arr));
    }
}
