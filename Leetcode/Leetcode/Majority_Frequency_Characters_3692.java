package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Frequency_Characters_3692 {
    public static String majorityFrequencyCharacters(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        // Find majority frequency characters
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = majorityFrequencyCharacters("aaabbbccdddde");
        System.out.println(str);
    }
}
