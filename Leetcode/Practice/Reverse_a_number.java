public class Reverse_a_number {
    public static int reverse(int n) {
        int temp = 0, sum = 0;

        while (n != 0) {
            temp = n % 10;
            n = n / 10;
            sum = sum * 10 + temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;

        System.out.println("Reverse no : " + reverse(num));
    }
}
