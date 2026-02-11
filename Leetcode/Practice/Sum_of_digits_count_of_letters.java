public class Sum_of_digits_count_of_letters {

    public static void countString(String str) {

        int sum = 0, count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
            if (Character.isLetter(ch)) {
                count++;
            }
        }

        System.out.println("Sum of digits : " + sum);
        System.out.println("No of letters : " + count);
    }

    public static void main(String[] args) {
        String str = "Forti123Net45";

        countString(str);
    }
}