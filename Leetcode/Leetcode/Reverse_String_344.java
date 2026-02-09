package Leetcode;

import java.util.Arrays;

public class Reverse_String_344 {
    public static void reverseString(char[] s) {
        int j = s.length - 1;
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            if (i < j) {
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        char[] str = { 'h', 'e', 'l', 'l', 'o' };

        System.out.println("Original : " + Arrays.toString(str));

        reverseString(str);

        System.out.println("Reverse : " + Arrays.toString(str));
    }
}
