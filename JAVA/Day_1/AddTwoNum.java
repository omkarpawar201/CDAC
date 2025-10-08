import java.util.Scanner;

class AddTwoNum {
    public static void main(String args[]) {
        System.out.println("Enter Two Numbers:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Addition of Two Num : " + (n1 + n2));

        sc.close();
    }

}