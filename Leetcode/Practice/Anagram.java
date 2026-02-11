import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        // String str1 = "listen";
        // String str2 = "silent";
        
        // char[] arr1 = str1.toCharArray();
        // Arrays.sort(arr1);
        // char[] arr2 = str2.toCharArray();
        // Arrays.sort(arr2);
        
        // String str = new String(arr1);
        // String str3 = new String(arr2);

        // System.out.println(str + " " + str3);

        // if (str.equals(str3))
        // System.out.println("String is anagram");
        // else
            // System.out.println("Not anagram");
        String str1 = "listen";
        String str2 = "silent";

        Map<Character, Integer> hmap1 = new HashMap<>();
        Map<Character, Integer> hmap2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            hmap1.put(str1.charAt(i), hmap1.getOrDefault(str1.charAt(i), 0) + 1);
        }

        System.out.println(hmap1);

        for (int i = 0; i < str2.length(); i++) {
            hmap2.put(str2.charAt(i), hmap2.getOrDefault(str2.charAt(i), 0) + 1);
        }

        System.out.println(hmap2);

        
    }
}
