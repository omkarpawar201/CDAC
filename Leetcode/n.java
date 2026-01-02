public class n {
    public static double findMaxAverage(int[] nums, int k) {
        double prev_avg = 0;
        double current_avg = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            for (int j = i; j < k + i; j++) {
                if (j < nums.length) {
                    sum = sum + nums[j];
                }
            }

            System.out.println("sum : " + sum);
            current_avg = sum / k;
            System.out.println("Curr avg : " + current_avg);

            if (current_avg > prev_avg) {
                prev_avg = current_avg;
            }
            current_avg = 0;
            sum = 0;
        }
        return prev_avg;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 12, -5, -6, 50, 3 };

        double num = findMaxAverage(arr, 4);

        System.out.println();
        System.out.println("Max avg : " + num);
    }
}
