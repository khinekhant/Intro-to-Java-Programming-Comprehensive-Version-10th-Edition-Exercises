package exercise6_7;

import java.util.Scanner;

public class Exercise6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter invested amount: ");
		double amount=input.nextDouble();
		
		System.out.print("Enter annual interest rate: ");
		double interestRate=input.nextDouble();
		
		System.out.println("Year"+"       "+"Amount");
		
		futureInvestmentValue(amount,interestRate,30);
		
	}

	private static void futureInvestmentValue(double amount, double interestRate, int years) {
		// TODO Auto-generated method stub
		double monthlyInterestRate=interestRate/1200;
		 
		for(int i=1;i<=years;i++){
			double futureValue=0.0;
			System.out.print(i+"     ");
			
			futureValue +=amount*Math.pow(1+monthlyInterestRate, i*12);
			
			System.out.printf("%5.2f",futureValue);
			System.out.println();
			
		}
		
	}
	
	

}
