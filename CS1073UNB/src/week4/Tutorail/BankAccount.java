package week4.Tutorail;

import jdk.jshell.spi.ExecutionControl;

public class BankAccount{

	private String name;
	private String type;
	private int num;
	private double balance;
	private Terms terms;
	private double term;
	private double fee;



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
		this.term = term;
		this.fee = fee;

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

	//Method to calculate end of month balance (interest rate, fee)
	public void monthEnd(double rate, double fee){
		balance = balance*(1+rate) - fee;
	}

	//Method to calculate end of month balance using the Term rate and fee
	public void monthEnd(){
		//complete this method
		if (terms == null) {
			balance = balance*(1 + term) - fee;

		}else{
			balance = balance*(1+this.terms.getRate()) - this.terms.getFee();
		}
	}

	
	public String toString(){
		if (terms != null) {
			return "Name: " + name + "\n\tAccount #: " + num +
					"\n\tType: " + type + " account" + "\n\t" + terms;
		}else {

		}
		return "Name: " + name + "\n\tAccount #: " + num +
				"\n\tType: " + type + " account" + "\n\t" +
		"\t{rate=: " + term + ",\tfee=" + fee +"}";
	}

}