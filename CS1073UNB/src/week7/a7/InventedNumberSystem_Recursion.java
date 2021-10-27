package week7.a7;

import java.util.Scanner;

/**
 * A7 Q2 solution 2
 * This class uses a recursive algorithm to achieve invented number System
 * @author Wei Liu
 */
public class InventedNumberSystem_Recursion {
    private int[] value = { 1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000 };
    private char[] symbol = { '|', 'r', '^', 'R', 'H', 'J', 'X', 'T', 'M', 'P' };
    private final int index = symbol.length;
    private int temp = index;

    public void recursion(Long n) {
        temp--;
        if (n < 5) {
            for (int i = 0; i < n; i++) {
                System.out.print("|");
            }
        } else {
            for (int i = 0; i < n / value[temp]; i++) {
                System.out.print(symbol[temp]);
            }
            recursion(n%value[temp]);
        }
    }

    public static void main(String[] args) {
        long n = 1L;
        InventedNumberSystem_Recursion inv = new InventedNumberSystem_Recursion();
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
        inv.recursion(n);
    }
}
