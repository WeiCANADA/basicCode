package week11;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author: Wei Liu
 * @date: 2021-11-18 11:53 a.m.
 */
public class CountE {
    public static void main(String[] args) {
        String phrase = null;
        int totalCount = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phase: ");
        if (scan.hasNextLine()){
            phrase = scan.nextLine();
        }
        assert phrase != null;
        phrase = phrase.toLowerCase(Locale.ROOT);

        Scanner token = new Scanner(phrase);

        while (token.hasNext()){
            int count = 0;
            String str = token.next();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'e'){
                    count++;
                totalCount++;
                }
            }
            System.out.println(count);
        }
        System.out.println("There are " + totalCount + " 'e' in total.");

    }
}
