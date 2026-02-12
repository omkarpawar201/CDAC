package Leetcode;

public class Rearrange_vowels_consonents {
    public static String reString(String str) {

        StringBuilder vow = new StringBuilder();
        StringBuilder con = new StringBuilder();
        StringBuilder result = new StringBuilder();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'i') {
                vow.append(arr[i]);
            } else {
                con.append(arr[i]);
            }
        }
        System.out.println(vow);
        System.out.println(con);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                result.append(vow.charAt(i / 2));
            } else {
                result.append(con.charAt(i / 2));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "applee";

        System.out.println(reString(str));
    }
}
