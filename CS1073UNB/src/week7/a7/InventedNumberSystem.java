package week7.a7;

import java.util.Scanner;

/**
 * * A7 Q2 solution 1
 * This class uses loops to achieve invented number
 *
 * @author Wei Liu
 */
public class InventedNumberSystem {
    public static void main(String[] args) {
        int[] value = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000 };
        char[] symbol = { '|', 'r', '^', 'R', 'H', 'J', 'X', 'T', 'M', 'P' };
        long n = 1;
        int index = symbol.length - 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("an Arabic number between 1 and 9999999 (inclusive)");
        if (scan.hasNextLong()) {
            n = scan.nextLong();
        }
        while (n < 1 || n > 9999999) {
            System.out.println("Invalid input. You must enter a number between 1 and 9999999.");
            System.out.print("Please enter another number now:");
            if (scan.hasNextLong()) {
                n = scan.nextLong();
            }
        }
        //When n > = 5
        for (int i = value.length - 1; i > 0; i--) {
            for (int k = 0; k < n / value[i]; k++) {
                System.out.print(symbol[index]);//array1[9]= 'P'
            }
            index--;// index = 8
            n %= value[i];//45206 % 50000 =45206
        }
        //When n < 5
        for (int i = 0; i < n; i++) {
            System.out.print("|");
        }
    }
}
