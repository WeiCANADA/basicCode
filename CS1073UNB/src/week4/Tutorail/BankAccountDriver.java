package week4.Tutorail;

import java.time.Month;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-09-30 9:08 p.m.
 */
public class BankAccountDriver {
    public static void main(String[] args) {
        //Create Terms object
        Terms t1 = new Terms(0.05, 5.50);
        BankAccount sam = new BankAccount("Sam", "Savings", 1234, t1);
        sam.deposit(50);
        BankAccount monica = new BankAccount("Monica", "Chequings", 9876, t1);
        monica.deposit(75);

         BankAccount joe = new BankAccount("Joe", "Savings", 5432, 0.03, 4.50);
         System.out.println(sam.toString() + "\nBalance: $" + sam.getBalance());
        /*Name: Sam
        Account #: 1234
        Type: Savings account
        Terms{rate=0.05, fee=5.5}
        Balance: $50.0
        */
        sam.monthEnd();
        System.out.println("Month End Balance: $" + sam.getBalance());
        //Month End Balance: $47.0
        System.out.println();
        System.out.println(monica.toString() + "\nBalance: $" + monica.getBalance());
        /*Name: Monica
	Account #: 9876
	Type: Chequings account
	Terms{rate=0.05, fee=5.5}
    Balance: $75.0*/
        monica.monthEnd();
        System.out.println("Month End Balance: $" + monica.getBalance());
        //Month End Balance: $73.25
        System.out.println(joe.toString() + "\nBalance: $" + joe.getBalance());
        joe.monthEnd();
        System.out.println("Month End Balance: $" + joe.getBalance());
    }
}
