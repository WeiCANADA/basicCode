package week12;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Wei Liu
 */
public class String_Counters {
    public static void main(String[] args) {
        int times = 0;
        char letter = 0;
        //int[] intArray = lettercounter("abac123");
        int[] intArray = lowerLetterCount("a123");
        for (int i = 0; i < intArray.length; i++) {
            if (i > times) {
                times = intArray[i];
                if (i < 27) letter =(char)(i + 65);
                else letter = (char)(i-26 + 97);
            }
        }
        String letterS = letter + "";
        System.out.println( letterS + times);



/*        int others = 0;
        System.out.print("Enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //call upperLetterCount(String str)
        int[] array = upperLetterCount(str);
        //print
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) (i + 'A'));
            System.out.print(": " + array[i]+'\t');
        }
        System.out.println();
        //call lowerLetterCount(String str)
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
        */
    }


    private static int[] upperLetterCount(String str) {
        final int NUMCHARS = 26;
        char current;
        int[] upperLetters = new int[NUMCHARS];
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if ('A' <= current && current <= 'Z') {
                upperLetters[current - 'A']++;
            }
        }
        return upperLetters;
    }

    private static int[] lowerLetterCount(String str) {
        final int NUMCHARS = 26;
        char current;
        int[] lowerLetters = new int[NUMCHARS];
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if ('a' <= current && current <= 'z') {
                lowerLetters[current - 'a']++;
            }

        }
        return lowerLetters;
    }

    /**
     * @param str A String
     * @return int[] i   the indexes represent the zimu (combine the upper cases and lower cases)
     * the value i represent the show times of each zimu in the string
     */
    public static int[] lettercounter(String str) {
        str = str.replaceAll("[^A-Za-z]", "");
        final int NUMCHARS = 52;
        char current;
        int[] letters = new int[NUMCHARS];
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if (65 <= current) {
                letters[current - 65]++;
            }

        }
        return letters;
    }
}
