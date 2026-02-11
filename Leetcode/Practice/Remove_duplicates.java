import java.util.Arrays;

public class Remove_duplicates {
    public static void removeDuplicates(int[] array) {
        Arrays.sort(array);
        int j = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j - 1]) {
                array[j] = array[i];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1 };

        System.out.println(Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
}
