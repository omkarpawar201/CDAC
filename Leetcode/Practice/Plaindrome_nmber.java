public class Plaindrome_nmber {
    public static boolean plaindrome_nmber(int n) {
        int temp = 0, sum = 0, org = n;

        while (n != 0) {
            temp = n % 10;
            n = n / 10;
            sum = sum * 10 + temp;
        }

        if (org == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int num = 121;

        if (plaindrome_nmber(num))
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome");

    }
}
