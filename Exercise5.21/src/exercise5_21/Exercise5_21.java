package exercise5_21;

import java.util.Scanner;

public class Exercise5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        // making scanner buffer
        Scanner input = new Scanner(System.in);

        // getting loan amount
        System.out.printf("Loan amount: ");
        double loanAmount = input.nextDouble();

        // asking number of years
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        // formating title display

        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");
        // making loop to display different interest rates
        for ( double annualInterestRate = 5.00; annualInterestRate <= 8.00; annualInterestRate += 0.125) {

            // calculating monthly and total payment rates
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = (loanAmount * Math.pow(1+monthlyInterestRate, numberOfYears * 12 )) *
            		monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)-1);

            double totalPayment = monthlyPayment * numberOfYears * 12;

            // making % string for formatting reasons...
            String str = "%";

            // Displaying formatted info
            System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate , str,
            		((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));

        }
	}

}
