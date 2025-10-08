import java.util.Scanner;

public class MinMax {

    public int min(int arr[]) {

        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public int max(int arr[]) {

        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Elements");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        MinMax obj1 = new MinMax();

        System.out.println("The Min Element is ");
        System.out.println(obj1.min(arr));
        
        System.out.println("The Max Element is ");
        System.out.println(obj1.max(arr));

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
    }
}
