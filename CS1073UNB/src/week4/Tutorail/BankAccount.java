package week4.Tutorail;

import jdk.jshell.spi.ExecutionControl;

public class BankAccount{

	private String name;
	private String type;
	private int num;
	private double balance;
	private Terms terms;

	public BankAccount(String nameIn, String typeIn, int numIn, Terms termsIn){
		name = nameIn;
		type = typeIn;
		num = numIn;
		balance = 0.0;
		terms = termsIn;
	}

	public BankAccount(String name, String type, int num, double term, double fee){
		//finish the constructor here
		this.name = name;
		this.type = type;
		this.num = num;
		this.terms = new Terms(term,fee);
	}
	
	//write the accessor and mutator methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public void deposit(double money){
		//complete this method
		this.balance += money;
	}

	public void withdraw(double money){
		balance = balance - money;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Terms getTerms() {
		return terms;
	}

	public void setTerms(Terms terms) {
		this.terms = terms;
	}
	public void setTerms(double term, double fee){
		this.terms.setRate(term);
		this.terms.setFee(fee);
	}

	//Method to calculate end of month balance (interest rate, fee)
	public void monthEnd(double rate, double fee){
		balance = balance*(1+rate) - fee;
	}

	//Method to calculate end of month balance using the Term rate and fee
	public void monthEnd(){
		//complete this method
			balance = balance*(1+this.terms.getRate()) - this.terms.getFee();
	}

	public String toString(){
			return "Name: " + name + "\n\tAccount #: " + num +
					"\n\tType: " + type + " account" + "\n\t" + terms;
	}

}