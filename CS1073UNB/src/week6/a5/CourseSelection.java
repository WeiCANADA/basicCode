package week6.a5;

import java.util.Scanner;
/**
 * A6 Q1 Programming Exercise: Can I take CS4997 Honours Thesis?
 * @author Wei Liu
 */
public class CourseSelection {
    public static void main(String[] args) {
        System.out.println(canTaken() ? "Yes, you can take CS4997" : "No, you cannot take CS4997");
    }

    /**
     * A canTaken method is used to determine whether the course can be taken.
     * @return true(false) if the course can(not) be taken
     */
    public static boolean canTaken() {
        //Determine whether the course can be taken, if it can be taken return true, otherwise return false.
        System.out.println("Have you successfully completed CS3997?");
        if (isYes()) {
            System.out.println("Are you in our final year?");
            if (isYes()) {
                System.out.println("Did you have at least a B average in the previous assessment year?");
                if (isYes()) {
                    return true;
                } else {
                    System.out.println("Do you have at least a B cumulative GPA?");
                    return isYes();
                }
            }
        }
        return false;
    }

    /**
     * An isYes method is used to determine  whether the keyboard input is "yes" or "no" or "others".
     * @return  true if the result is yes and false otherwise.
     */
    public static boolean isYes() {
        Scanner scan = new Scanner(System.in);
        // Accept the keyboard input
        String str = null;
        System.out.println("Enter yes/no :");
        if (scan.hasNext()) {
            str = scan.next();
            //Determine the keyboard input is yes or no, otherwise prompt for input again.
            while (str != null && !str.equals("yes") && !str.equals("no")) {
                System.out.print("The input is incorrect, please try again! \n " + "Enter yes/no :");
                if (scan.hasNext()) {
                    str = scan.next();
                }
            }
        }
        return str != null && str.equals("yes");
    }
}
