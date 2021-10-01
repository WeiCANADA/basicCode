package week3.tutorial_Programming;
/*Write a class that represents a bank account.
 name,
 the  account type (savings, chequing, etc),
 and the account number.  You
the balance of the account which is set to $0.00 when it is first opened.
• Write accessor and mutator methods for each instance variable.
• Write a method that allows you to deposit money into the account, this will accept as a
parameter the amount of money being deposited.
• Write a method that allows you to withdraw money from the account, this will accept as a
parameter the amount of money being withdrawn.
• Write a method that will return as a textual string the information about the account including
the person’s name, the account number and the type of account.
• Note:  for now we can assume that the account allows overdraft, so if they withdraw more than
what is in the account their balance will go below $0.00 */

public class BankAccount {
    private String clientName;
    private String accountType;
    private int accountNum;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String clientName, String accountType, int accountNum) {
        this.clientName = clientName;
        this.accountType = accountType;
        this.accountNum = accountNum;
        balance = 0;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Write a method that allows you to deposit money into the account, this will accept as a
    //parameter the amount of money being deposited.
    public void deposit(double dep){
        this.balance += dep;
    }
//    Write a method that allows you to withdraw money from the account, this will accept as a
//parameter the amount of money being withdrawn
public void withdraw(double wd){
    this.balance -= wd;
}
// Write a method that will return as a textual string the information about the account including
//the person’s name, the account number and the type of account.
    public void outPut() {
        System.out.println("BankAccount :" +
                "clientName= " + clientName + '\t' +
                ",accountType=" + accountType + '\t' +
                ",accountNum=" + accountNum +
                ".");
    }

    @Override
    public String toString() {
        return "BankAccount:" +
                "clientName='" + clientName + '\n' +
                ", accountType='" + accountType + '\n' +
                ", accountNum=" + accountNum + '\n' +
                ", balance=" + balance +
                '\n';
    }
}
