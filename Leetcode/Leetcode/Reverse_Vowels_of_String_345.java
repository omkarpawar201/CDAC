package Leetcode;

public class Reverse_Vowels_of_String_345 {
    public static String reverseVowels(String s) {
        int j = s.length() - 1;
        char[] arr = s.toCharArray();

        s.indexOf(j);

        for (int i = 0; i < s.length(); i++) {
            if (i < j) {
                char c = arr[i];
                char c2 = arr[j];

                if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'i' && c != 'I' && c != 'o' && c != 'O'
                        && c != 'u'
                        && c != 'U') {
                    i++;
                }
                if (c2 != 'a' && c2 != 'A' && c2 != 'e' && c2 != 'E' && c2 != 'i' && c2 != 'I' && c2 != 'o' && c2 != 'O'
                        && c2 != 'u'
                        && c2 != 'U') {
                    j--;
                }

                if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O'
                        || c == 'u'
                        || c == 'U' || c2 == 'a' || c2 == 'A' || c2 == 'e' || c2 == 'E' || c2 == 'i' || c2 == 'I'
                        || c2 == 'o' || c2 == 'O'
                        || c2 == 'u'
                        || c2 == 'U') {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "leetcode";

        System.out.println("New string : " + reverseVowels(str));
    }
}
