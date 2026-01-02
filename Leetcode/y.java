import java.util.ArrayList;
import java.util.List;

public class y {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int number = 0;
        int n = num.length - 1;

        List<Integer> list = new ArrayList<>();

        // for (int i : num) {
        // number += i * Math.pow(10, n);
        // n = n - 1;
        // }
        //  

        // while (number != 0) {
        // int temp = number % 10;
        // number = number / 10;
        // list.add(0, temp);
        // }

        while (n >= 0 || k > 0) {
            if (n >= 0) {
                k += num[n];
                n--;
            }
            list.add(0, k % 10);
            k = k / 10;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int k = 1;

        List<Integer> list = addToArrayForm(arr, k);

        System.out.println();
        System.out.println(list);
    }
}
