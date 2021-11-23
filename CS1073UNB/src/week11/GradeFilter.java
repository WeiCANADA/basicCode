package week11;

import java.util.Locale;
import java.util.Scanner;

/**
 * @description: Allow the user to enter a comma separated list of grades.
 * Find the average of all the grades given. Make sure if there are any characters
 * or Strings then your program should ignore these values and continue.
 * •
 * Example of input and output:
 * @author: Wei Liu
 * @date: 2021-11-18 12:29 p.m.
 */
public class GradeFilter {
    public static void main(String[] args) {
        String input = null;
        int totalCount = 0;
        double totalGrades = 0;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter grades separated by commas: ");
        if (scan.hasNextLine()) {
            input = scan.nextLine();
        }

        Scanner scanText = new Scanner(input).useDelimiter(",");
        while (scanText.hasNext()) {
            //Suppose the value is expected grade
            //boolean validChar = true;
  /*          //get the value
            String str = scanText.next();
            //Check whether str contains non-numeric character
            for (int i = 0; i < str.length(); i++) {
                char cha = str.charAt(i);
                if ((cha < '0' || cha > '9' )&& !(cha == '.')) {
                    //has unexpected char
                    validChar = false;
                    break;
                }
            }
            // if str is a numeric value*/
            if (scanText.hasNextDouble()) {
                totalGrades += scanText.nextDouble();
                totalCount++;
            } else {
                scanText.next();
            }
            //if the input do not has any expected grade
            if (totalCount == 0)
                totalCount += 1;
        }
        System.out.println("The average grade is: " + totalGrades / totalCount);
    }
}