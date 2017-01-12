package exercise5_22;

import java.util.Scanner;

public class Exercise5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        // getting loan amount
	       System.out.printf("Loan amount: ");
	        double loanAmount = input.nextDouble();

	        // asking number of years
	        System.out.print("Number of Years: ");
	        int years = input.nextInt();
	        
	        System.out.print("Enter Annual Interest Rate: ");
	        double interestRate=input.nextDouble();
	        
	        System.out.printf("%-15s%-15s%-15s%-15s", "Payment#","Interest","Principal","Balance");
	        System.out.println();
	        double monthlyInterestRate=interestRate/1200;
	        double monthlyPayment = (loanAmount * Math.pow(1+monthlyInterestRate, years * 12 )) *
            		monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, years * 12)-1);
	        
	        double balance=loanAmount;
	        
	        for(int i=1;i<=years*12;i++){
	        	double monthlyInterest=monthlyInterestRate*balance;
	        	double principal=monthlyPayment-monthlyInterest;
	        	balance-=principal;
	        	
	        	System.out.printf("%-15d%-15.2f%-15.2f%-15.2f",i, monthlyInterest,principal,balance);
	        	System.out.println();
	}
	        
	}

}
