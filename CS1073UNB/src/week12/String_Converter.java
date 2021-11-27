package week12;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A10 Q1
 * Converter  class that contains two static methods, bin2decimal and english2encrypted.
 *
 * @author Wei Liu
 */
public class String_Converter {
    public static void main(String[] args) {
       // System.out.println(bin2Decimal("1000000111"));
        System.out.println(english2encrypted("Dave   and Jeni in a group"));
    }

    /**
     * Returns an integer value equal the binary number.
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
        StringBuilder returnStr = new StringBuilder();
        //cuts all chars are not alphabets and space
        str = str.replaceAll("[^A-Za-z\\s]", "");
        //Replace the space greater than one with a space
        str = str.replaceAll("\\s+", " ");
        str = str.toUpperCase();
        str = str.replace('E', '3');
         str = str.replace('B', '8');
        System.out.println(str);

        Scanner scan = new Scanner(str);
        while (scan.hasNext()) {
            String temp = scan.next();
            StringBuilder encryptWord = new StringBuilder();
            int len = temp.length();
            for (int i = 0; i < len; i++) {
                char check = temp.charAt(i);
                switch (check) {
                    case 'A': encryptWord.append("V");
                        break;
                    case 'V':
                        encryptWord.append("A");
                        break;
                    case 'O':
                        encryptWord.append("Q");
                        break;
                    case 'Q':
                        encryptWord.append("O");
                        break;
                    case 'Y':
                        encryptWord.append("I");
                        break;
                    case 'I':
                        encryptWord.append("Y");
                        break;
                    default: encryptWord.append(check);
                }
            }
            int len1 = encryptWord.length();
            if(len > 1){
                char temp1 = encryptWord.charAt(0);
                encryptWord.replace(0 , 1, encryptWord.charAt(len1 -1) + "");
                encryptWord.replace(len1 -1 , len1,  temp1 + "");
            }
            returnStr.append(encryptWord.append(" "));
        }





/*

        Scanner scan = new Scanner(str);
        while (scan.hasNext()) {
            String str1 = scan.next();

            int len = str1.length();
            for (int i = 0; i < len; i++) {
                char check = str.charAt(i);

            }

            char[] chars = str1.toCharArray();

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
                char temp = chars[0];
                chars[0] = chars[len - 1];
                chars[len - 1] = temp;

            }
           // returnStr += String.valueOf(chars) + " ";
        }
        //return returnStr.trim();

 */
        return returnStr.toString();
    }

}
