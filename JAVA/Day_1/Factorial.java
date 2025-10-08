import java.util.Scanner;

class Factorial {

    public int factorialCal(int n) {

        int mul = 1;

        for (int i = 1; i <= n; i++) {
            mul *= i;
        }

        return mul;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        Factorial fact = new Factorial();

        System.out.println("Factorial of " + num + " is " + fact.factorialCal(num));
        // System.out.println("Factorial of " + num + " is " + factorialCal(num));
        // System.out.println("Factorial of " + num + " is " + Factorial.factorialCal(num));

        sc.close();
    }
}
