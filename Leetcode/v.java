import java.util.HashMap;
import java.util.Map;

public class v {

    public static boolean isIsomorphic() {
        Map<Character, Character> sMap = new HashMap<>();
        String s1 = "egg";
        String s2 = "add";
        System.out.println();

        for (int i = 0; i < s1.length(); i++) {
            if (!sMap.containsValue(s2.charAt(i)) && !sMap.get(s1.charAt(i)).equals(s2.charAt(i))) {
                sMap.put(s1.charAt(i), s2.charAt(i));
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(isIsomorphic());
    }
}