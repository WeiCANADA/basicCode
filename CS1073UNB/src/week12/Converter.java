package week12;

import java.util.Scanner;

/**
 * A10 Q1
 * Converter  class that contains two static methods, bin2decimal and english2encrypted.
 *
 * @author Wei Liu
 */
public class Converter {
    public static void main(String[] args) {
       // System.out.println(bin2Decimal("1000000111"));
        System.out.println(english2encrypted("baluga"));
    }

    /**
     * Returns an integer value equal the binary parameter.
     *
     * @param bin2 An unsigned (nonnegative) binary number represented by a string.
     * @return The decimal equivalent for the binary parameter, as an integer.If the binary string is invalid (contains characters other than ‘0’ and ‘1’), the method returns -1.
     */
    public static int bin2Decimal(String bin2) {
        int sum = 0;
        if (bin2.matches("[0-1]+")) {
            int len = bin2.length();

            for (int i = 0; i < len; i++) {
                int dt = Integer.parseInt(bin2.substring(i, i + 1));
                sum += Math.pow(2, len - 1 - i) * dt;
            }
        } else {
            return -1;
        }
        return sum;
    }

    /**
     * Returns an specific string .
     *
     * @param str A word or sentence represented by a string
     * @return The encrypted equivalent for the English word or sentence parameter, as a string.
     */
    public static String english2encrypted(String str) {
        String returnStr = "";
        str = str.replaceAll("[^A-Za-z\\s]", "");
        str = str.toUpperCase();
        str = str.replace('E', '3');
        str = str.replace('B', '8');
        System.out.println(str);


        Scanner scan = new Scanner(str);
        while (scan.hasNext()) {

            String str1 = scan.next();
            char[] chars = str1.toCharArray();
            int len = chars.length;
            for (int i = 0; i < len; i++) {
                if (chars[i] == 'A') {
                    chars[i] = 'V';
                } else if (chars[i] == 'V') {
                    chars[i] = 'A';
                } else if (chars[i] == 'O') {
                    chars[i] = 'Q';
                } else if (chars[i] == 'Q') {
                    chars[i] = 'O';
                } else if (chars[i] == 'Y') {
                    chars[i] = 'I';
                } else if (chars[i] == 'I') {
                    chars[i] = 'Y';
                }
            }

            if (len > 1) {
/*                StringBuilder sb = new StringBuilder(str);
                char c1 = str.charAt(0);
                char c2 = str.charAt(len - 1);
                sb.replace(0, 1, c2 + "");
                sb.replace(len -1, len, c1 + "");
                str = sb.toString();*/


                char temp = chars[0];
                chars[0] = chars[len - 1];
                chars[len - 1] = temp;

            }
            returnStr = returnStr.concat(String.valueOf(chars));
            returnStr = returnStr.concat(" ");
        }
        return returnStr;
        //return str;
    }
}
