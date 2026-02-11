public class Second_largest_no_in_array {
    public static int maxElement(int[] array) {
        int max = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public static int secondElement(int[] array) {
        int max = maxElement(array);
        int sec_max = array[0];

        for (int i : array) {
            if (i > sec_max && i < max) {
                sec_max = i;
            }
        }

        return sec_max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 8, 20 };

        System.out.println("Second largest element : " + secondElement(arr));
    }
}
