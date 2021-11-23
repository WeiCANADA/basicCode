package week12;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Wei Liu
 */
public class LetterCount {
    public static void main(String[] args) {
        int others = 0;
        System.out.print("Enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] array = upperLetterCount(str);
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) (i + 'A'));
            System.out.print(": " + array[i]+'\t');
        }
        System.out.println();
        array = lowerLetterCount(str);
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) (i + 'a'));
            System.out.print(": " + array[i] + "\t");
        }
        System.out.println();
        String regExp = "[^A-Za-z]+?";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            others++;
            System.out.println("fund：" + matcher.group(0));
        }
        System.out.println();
        System.out.println("Non-alphabetic characters: " + others);
    }


    private static int[] upperLetterCount(String str) {
        final int NUMCHARS = 26;
        char current;
        int[] upper = new int[NUMCHARS];
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if ('A' <= current && current <= 'Z') {
                upper[current - 'A']++;
            }
        }
        return upper;
    }

    private static int[] lowerLetterCount(String str) {
        final int NUMCHARS = 26;
        char current;
        int[] lower = new int[NUMCHARS];
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if ('a' <= current && current <= 'z') {
                lower[current - 'a']++;
            }
        }
        return lower;
    }
}
