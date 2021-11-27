package week12;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.time.Year;
import java.util.Scanner;

/**
  An employee’s user ID is composed of their last name, their birth year,
 * followed by their first name.
 * For example Jane Smith’s ID is:
 * Smith1997Jane
 * Write a program that accepts the employee’s ID as input and prints out their age.
 * Example of input and output:
 * Enter your employee ID: Smith1997Jane
 * Age: 24
 * @author: Wei Liu
 * @date: 2021-11-18 6:46 p.m.
 */
public class String_BirthYearFilter {
    public static void main(String[] args) {
        String empID = null;
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your employee ID: ");
        if (scan.hasNextLine()) {
            empID = scan.nextLine();
        }
		//birthYear(empID);
        int age = Year.now().getValue() - birthYear(empID);
        System.out.println("Age: " + age);

    }
	public static int birthYear( String empID){

        int beginIndex = 0;
        int endIndex = 0;

        assert empID != null;
        Scanner token = new Scanner(empID);
        while (token.hasNext()) {
            String str = token.next();

            for (int i = 0; i < str.length(); i++) {
                char cha = str.charAt(i);
                //Filter the number
                if (47 < cha && cha < 58) {

                    //the index of the first number
                    if (beginIndex == 0) {
                        beginIndex = i;
                    }
                    //the index of the last number
                    if (endIndex <= i) {
                        endIndex = i;
                    }
                }
            }
        }
        return Integer.parseInt(empID.substring(beginIndex, endIndex + 1));

    }
}
