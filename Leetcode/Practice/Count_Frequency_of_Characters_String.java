import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_of_Characters_String {
    public static void countFreq(String str) {
        Map<Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0) + 1);
        }

        System.out.println(hmap);
    }

    public static void main(String[] args) {
        String str = "aaaabbbc";
        countFreq(str);
    }
}
