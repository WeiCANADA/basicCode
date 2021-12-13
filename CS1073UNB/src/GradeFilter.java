import java.util.Locale;
import java.util.Scanner;

/**
 * nter a comma separated list of grades.
 * Find the average of all the grades given. Make sure if there are any characters
 * or Strings then your program should ignore these values and continue.
 * •
 * Example:
 *  Enter grades separated by commas: 60, 70.5, A, 90
 * and output:  the average grade is: 73.5
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