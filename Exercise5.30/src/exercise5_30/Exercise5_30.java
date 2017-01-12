package exercise5_30;

import java.util.Scanner;

public class Exercise5_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter the amount to be saved for each month: ");
		    double monthlyDeposit = input.nextDouble();

		    System.out.print("Enter the annual interest rate: ");
		    double annualInterestRate = input.nextDouble();
		    
		    
		    System.out.print("Enter the number of months: ");
		    int numberOfMonths = input.nextInt();
		    
		    double monthlyInterestRate=annualInterestRate/1200;
		    
		    double savingAmount=0.0;
		    for(int month=0; month<=numberOfMonths; month++){
		    	savingAmount+=monthlyDeposit*(1+ monthlyInterestRate);
		    }
		    System.out.println(savingAmount);

		    
	}

}
