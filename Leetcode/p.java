public class p {

    public static char nextGreatestLetter(char[] letters, char target) {

        int num = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                num = letters[i];
                break;
            }
            else{
                num = letters[0];
            }
        }

        char ch = (char)num;
        return ch;
    }

    public static void main(String[] args) {
        char[] arr = { 'x', 'x', 'y', 'y' };
        char target = 'x';

        char ch = nextGreatestLetter(arr, target);

        System.out.println();
        System.out.println(ch);
    }
}
