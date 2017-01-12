package exercise11_8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
private String name;
private double balance;
private int id;
private double annualInterest;
private Date date;
private ArrayList<Transaction> transactions=new ArrayList<>();





public Account() {
	// TODO Auto-generated constructor stub
}

public Account(String name, double balance, int id) {
	//super();
	this.name = name;
	this.balance = balance;
	this.id = id;
	date=new Date();
}




public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public double getAnnualInterest() {
	return annualInterest;
}


public void setAnnualInterest(double annualInterest) {
	this.annualInterest = annualInterest;
}


public Date getDate() {
	return date;
}



public void setDate(Date date) {
	this.date = date;
}


public ArrayList<Transaction> getTransactions() {
	return transactions;
}



public void setTransactions(ArrayList<Transaction> transactions) {
	this.transactions = transactions;
}  



public double monthlyInterestRate(){
	return annualInterest/1200;
}

public double getMonthlyInterest(){
	return balance*monthlyInterestRate();
}

public void withDraw(double amount){
	balance-=amount;
	transactions.add(new Transaction('W',amount,balance,"Withdraw"));
}

public void deposit(double amount){
	balance+=amount;
	transactions.add(new Transaction('D', amount, balance, "Deposit"));
}




public String toString(){
	String string1="";
	String string2="";
	 string1="Account Summary \n\nUser Name: "+getName()+"\nInterest Rate: "+getAnnualInterest()+"\nBalance: "+getBalance();
	 System.out.println(string1);
	 System.out.println("\n\nTrancaction Summary\n\n");
	 for(int i=0;i<transactions.size();i++){
		 Transaction transaction=transactions.get(i);
		string2="Type: "+transaction.getType()+"\nAmount: "+transaction.getAmount()+
				"\nBalance: "+transaction.getBalance()+"\nDescription: "+transaction.getDescription();
		
		System.out.print(string2+"\n\n");
	 }
	 
	 return null;
	 
}

}
