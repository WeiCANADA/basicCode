package week12.a11;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author: Wei Liu
 */
public class CharCounter {
    public static void main(String[] args) {
        System.out.println(counter("sdfgdddddd"));
    }

    /**
     * @param str A String
     * @return  The frequently letter
     */
    public static String counter(String str) {
        //Strip all non-letter characters
        str = str.replaceAll("[^A-Za-z]", "");
       str = str.toLowerCase(Locale.ROOT);
        char[] chars = str.toCharArray();
        //index represent the character code, value is the times
        int[] count = new int[128];
        for (char cha : chars) {
            count[cha]++;
        }
        // find the most frequently (index)letter and value (times)
        int times = 0;
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > times) {
                times = count[i];
                index = i;
            }
        }
        return (char) index + "";
    }
}