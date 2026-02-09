package Leetcode;

public class Add_Binary_67 {

    public static String addBinary(String a, String b) {

        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        int num3 = num1 + num2;

        String result = Integer.toBinaryString(num3);

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result : " + addBinary("11", "1"));
    }
}