import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class t {
    public static String mostCommonWord(String paragraph, String[] banned) {
        System.out.println();

        int max = 0;
        String str = "";

        paragraph = paragraph.toLowerCase().replaceAll("\\p{Punct}", "");
        String[] arr = paragraph.split(" ");

        // System.out.println(Arrays.toString(arr));
        // [bob, hit, a, ball, the, hit, ball, flew, far, after, it, was, hit]

        Map<String, Integer> map = new HashMap<>();

        for (String string : arr) {
            for (String string2 : banned) {
                if (!string.equals(string2)) {
                    map.put(string, map.getOrDefault(string, 0) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> ent : map.entrySet()) {
            if (ent.getValue() > max) {
                max = ent.getValue();
                str = ent.getKey();
            }
        }

        // System.out.println(str);
        // System.out.println(max);

        return str;
    }

    public static void main(String[] args) {
        String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = { "hit" };

        String str2 = mostCommonWord(str, banned);

        System.out.println(str2);
    }
}
