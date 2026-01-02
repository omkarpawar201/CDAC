import java.util.Arrays;

public class s {
    public static int[] numberOfLines(int[] widths, String s) {

        int sum = 0;
        int count = 1;

        System.out.println();
        for (int i = 0; i < s.length(); i++) {

            sum += widths[s.charAt(i) - 'a'];
            if (sum > 100) {
                System.out.println(sum);
                count++;
                sum = widths[s.charAt(i) - 'a'];
            }
        }

        System.out.println(count);
        System.out.println(sum);
        int[] arr = { count, sum };
        return arr;
    }

    public static void main(String[] args) {
        int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10 };
        String str = "bbbcccdddaaa";

        int[] result = numberOfLines(widths, str);

        System.out.println(Arrays.toString(result));
    }
}
