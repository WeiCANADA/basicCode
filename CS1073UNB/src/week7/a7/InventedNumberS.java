package week7.a7;

import java.util.Scanner;

/**
 * * A7 Q2 solution 1
 * This class uses while loop and if...else(else if) statement to achieve invented number
 *
 * @author Wei Liu
 */
public class InventedNumberS {
    public static void main(String[] args) {
        long n = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("an Arabic number between 1 and 9999999 (inclusive): ");
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
        do{
            if(n<10){
                print(n/5, 'r');
                n %= 5;
            }else if (n < 50){
                print(n/10, '^');
                n %= 10;
            }else if(n < 100){
                print(n/50, 'R');
                n %= 50;
            }else if (n < 500){
                print(n/100, 'H');
                n %= 100;
            }else if (n < 1000){
                print(n/500, 'J');
                n %= 500;
            }else if (n < 5000) {
                print(n / 1000, 'X');
                n %= 1000;
            }else if (n < 10000) {
                print(n / 5000, 'T');
                n %= 5000;
            }else if (n < 50000) {
                print(n / 10000, 'M');
                n %= 10000;
            }else {
                print(n/50000, 'P');
                n %= 50000;
            }

        }while(n >= 5);
        //When n < 5
        print(n,'|');
    }

    public static void print(long l, char c){
        while(l-- > 0){
            System.out.print(c);
        }
    }
}
