package week3.tutorial_Programming;

public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount client1 = new BankAccount("Sam", "Saving", 1234);
        client1.deposit(50);
        BankAccount client2 = new BankAccount("Monica", "chequing", 9876);
        client2.deposit(75);
        System.out.println(client1.toString() + "balance = $" + client1.getBalance());
        System.out.println(client2.toString() + "balance = $" + client2.getBalance());
        client1.withdraw(20);
        client2.withdraw(40);
        //client1.deposit(150);
        // client2.withdraw(20);
        // client2.deposit(110);
        System.out.println(client1);
        System.out.println(client2);
    }


}
