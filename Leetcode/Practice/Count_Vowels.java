public class Count_Vowels {
    public static int countVovels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "education";

        System.out.println("Number of vowels : " + countVovels(str));
    }
}
