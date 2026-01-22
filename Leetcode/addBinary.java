public class addBinary {
    public static void main(String[] args) {
        // int num = 5;
        // String binary = Integer.toBinaryString(num);

        // System.out.println("Binary : " + binary);

        // int num2 = Integer.parseInt(binary, 2);

        // System.out.println(num2);

        // String a =
        // "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        // String b =
        // "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        // // int num = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        // BigInteger num1 = new BigInteger(a, 2);
        // BigInteger num2 = new BigInteger( b, 2);
        // // long num1 = Long.parseLong(a, 2) + Long.parseLong(b, 2);
        // // String reString = Long.toBinaryString(num1);
        // String reString = Integer.toBinaryString(num);

        // System.out.println("Addition : " + reString);

        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            char num1 = a.charAt(i);
            char num2 = b.charAt(j);

            if (num1 == '0' && num2 == '0') {
                carry = 0;
                result.append('0');
            }
            if (num1 == '0' && num2 == '1') {
                carry = 0;
                result.append('1');
            }
            if (num1 == '1' && num2 == '0') {
                carry = 0;
                result.append('1');
            }
            if (num1 == '1' && num2 == '1') {
                carry = 1;
                result.append('0');
            }

            int sum =

                    i--;
            j--;
        }
    }
}
