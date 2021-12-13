package week12.a11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;

/**
 * This class represents a IceCream Scatter Plot
 * @author Wei Liu
 */
public class IceCreamScatterPlot {

    public static void main(String[] args) throws FileNotFoundException {

        String path1 = Objects.requireNonNull(IceCreamScatterPlot.class.getResource("July2020.in")).getPath();
        String path2 = Objects.requireNonNull(IceCreamScatterPlot.class.getResource("June2020.in")).getPath();
        scatterPlot(path1);
        scatterPlot(path2);

    }

    public static void scatterPlot(String path) throws FileNotFoundException {
        int[] dataA = new int[31];
        //load data file
        Scanner scan = new Scanner(new BufferedReader(new FileReader(path)));
        // Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        System.out.print(line);
        //read a line
        do {
            int index = 0;
            int sale = 0;
            //read a line
            line = scan.nextLine();
            //Split temperature and sales
            Scanner scan1 = new Scanner(line).useDelimiter(",");
            while (scan1.hasNextInt()) {
                int data = scan1.nextInt();
                if (data < 50) index = data;
                else sale = data;
            }
            //store the data index is the temperature , value is the sale.
            dataA[index] = sale;

        } while (scan.hasNextLine());

        System.out.println();
        final int Y = 1000;
        final int X = 30;
        for (int i = Y; i >= 0; i = i - 100) {
            //the bottom line
            if (i == 0) {
                System.out.print("$" + i + "\t\t" + "\u2514");
                System.out.println("--------------------------------------------------------");
                System.out.print("\t\t");
                for (int j = 0; j <= X; j = j + 5) {
                    if(j< 10) System.out.print(j + "     ");//print 8 spaces
                    else System.out.print(j + "     ");//print 7 spaces
                }
                //The other line
            } else {
                System.out.print("$" + i + "\t|");

                //Traverse the data array find the value that matches the y-axis value
                for (int k = 1; k < dataA.length; k++) {
                    if (dataA[k] == i) {
                        System.out.print(" *");//if match
                    }
                    System.out.print(" ");//if not
                }
            }
            // new line
            System.out.println();
        }
    }
}



