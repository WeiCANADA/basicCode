package week7.a7;

import java.util.Scanner;

/**
 * A7 Q1 PartB
 * This is a test driver for Class ConeCup.java and Class CylinderCup.java
 * @author Wei Liu
 */
public class CupDriver {
    public static void main(String[] args) {
        double r;
        double h;
        double smallestS = Double.POSITIVE_INFINITY;
        double largestV = 0;
        boolean smallestS_isCone = false;
        boolean largestV_isCone = false;
        int enterInt = 0;
        Scanner scan = new Scanner(System.in);
        ConeCup coneCup;
        CylinderCup cylinderCup;

        do {
            System.out.println("1 - Enter the information for a conical cup");
            System.out.println("2 - Enter the information for a cylindrical cup");
            System.out.println("3 - Quit");
            System.out.print("Enter your choice: ");
            if (scan.hasNextInt()) {
                enterInt = scan.nextInt();//Accept keyboard input
            }
            //Menu selection 1
            if (enterInt == 1) {
                System.out.print("Length of radius (cm):");
                r = positiveDouble();
                System.out.print("Length of height (cm):");
                h = positiveDouble();
                coneCup = new ConeCup(r, h);
                System.out.printf("Surface area: %.3fcm^2", coneCup.surfaceArea());
                System.out.println();
                System.out.printf("Volume: %.3fcm^2", coneCup.Volume());
                System.out.println();

                if (coneCup.surfaceArea() < smallestS) {
                    smallestS = coneCup.surfaceArea();
                    smallestS_isCone = true;
                }
                if (coneCup.Volume() > largestV) {
                    largestV = coneCup.Volume();
                    largestV_isCone = true;
                }
                //Menu selection 2
            } else if (enterInt == 2) {
                System.out.print("Length of radius (cm):");
                System.out.print("Length of radius (cm):");
                r = positiveDouble();
                System.out.print("Length of height (cm):");
                h = positiveDouble();
                cylinderCup = new CylinderCup(r, h);
                System.out.printf("Surface area: %.3fcm^2", cylinderCup.surfaceArea());
                System.out.println();
                System.out.printf("Volume: %.3fcm^2", cylinderCup.volume());
                System.out.println();

                if (cylinderCup.surfaceArea() < smallestS) {
                    smallestS = cylinderCup.surfaceArea();
                    smallestS_isCone = false;
                }
                if (cylinderCup.volume() > largestV) {
                    largestV = cylinderCup.volume();
                    largestV_isCone = false;
                }
                //re-prompt enter again
            } else {
                System.out.println("Not an available option.");
            }
        } while (enterInt != 3);// 3 out the loop

        //print the smallest surface area
        if (smallestS_isCone) {
            System.out.println("The cup with the smallest surface area is a Cone");
        } else {
            System.out.println("The cup with the smallest surface area is a Cylinder");
        }
        System.out.printf("The surface area is: %.3fcm^2 ", smallestS);
        System.out.println();
        //print the largest volume
        if (largestV_isCone) {
            System.out.println("The cup with the largest volume area is a Cone");
        } else {
            System.out.println("The cup with the largest volume area is a Cylinder");
        }
        System.out.printf("The volume is: %.3fcm^2 ", largestV);
        System.out.println();
    }

    //Return a positive double from keyboard
    public static double positiveDouble() {
        double enterDouble = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            if (scan.hasNextDouble()) {
                enterDouble = scan.nextDouble();
            }
            if (enterDouble > 0) {
                return enterDouble;
            } else {
                System.out.print("The value should be positive! Try again: ");
            }
        }
    }
}
