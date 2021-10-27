package week7.a6;
import java.util.Scanner;

/**
 * This Class will allow the user to enter grade information (as integer values) and will then generate a report for them.
 *
 * @author Wei Liu
 */
public class GradeApp {
    public static void main(String[] args) {
        int enterNum = 0;
        int goalGrade;
        int actualGrade = 0;
        int highestGrade = 0;
        int lowestGrade = 100;
        int countTotal = 0;
        int countBelow = 0;
        int sumGrade = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your goal grade: ");
        if (input.hasNext()){
            enterNum = input.nextInt(); // Accept keyboard input
        }
        //Filter the invalid input
        while (enterNum < 0 || enterNum > 100){
            System.out.println(" The grade must be between 0 and 100!");
            System.out.print("Please enter your goal grade: ");
            if (input.hasNext()){
                enterNum = input.nextInt();
            }
        }
        goalGrade = enterNum;       //Assign the entered value to goal grade

        //enter the grades that you have received so far.
        System.out.println("Next, enter the grades that you have received so far.");
        System.out.println("Enter a negative number when done:");
        while (true) {
            if (input.hasNext()) {
                enterNum = input.nextInt();     // Accept keyboard input
            }
                if (enterNum < 0) {
                    break;       //Determine whether the input is negative, if it is negative, jump out of the while loop

                }else if (enterNum <= 100){
                actualGrade = enterNum;     //Assign the valid keyboard input value to actual grade
            }

            sumGrade += actualGrade;
            countTotal++; //Count the actual grade entered in total
            if (actualGrade < goalGrade) {
                countBelow++;   //Count the actual grade below goalGrade
            }
            if (actualGrade > highestGrade) {
                highestGrade = actualGrade; //Record the the highest grade
            }
            if(actualGrade < lowestGrade){
                lowestGrade = actualGrade;  ////Record the the lowest grade
            }
        }
        // Output
        System.out.println("Your grade report:\n" +
                countTotal + " grades total\n" +
                countBelow + " below your goal grade");
        System.out.println( countTotal < 3 ?
                "Unable to calculate conservative average – not enough grades."
                : "Conservative average grade: "
                + (float) ((sumGrade - highestGrade - lowestGrade) / (countTotal - 2)) );
    }
}
