public class Reverse_a_string {
    public static String reveString(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            char temp = str.charAt(i);
            // str.charAt(i) = str.charAt(str.length() - 1);
        }
        return null;
    }

    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder("Hello");
        // str.reverse();
        // System.out.println(str);

        String str = "Hello";

        System.out.println("Reversed string : " + reveString(str));
    }
}
