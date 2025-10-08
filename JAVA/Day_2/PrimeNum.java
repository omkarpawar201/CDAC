import java.util.Scanner;

public class PrimeNum {

    public boolean primeNum(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        PrimeNum obj = new PrimeNum();

        boolean result = obj.primeNum(num);

        if (result) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is not Prime");
        }

        sc.close();
    }
}
