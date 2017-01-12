package exercise8_12;

import java.util.Scanner;

public class Exercise8_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] rates={0.10,0.15,0.25,0.28,0.33,0.35};
int[][] appliedAmount={
		{8350, 33950, 82250, 171550, 372950}, // Single filer
		{16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
		{8350, 33950, 68525, 104425, 186475}, // Married separately
		{11950, 45500, 117450, 190200, 372950} // Head of household
		};

Scanner input = new Scanner(System.in);
System.out.print("Enter your martial status(0-3): ");
int status = input.nextInt();
System.out.print("Enter your taxable income: ");
int income = input.nextInt();

System.out.println("Your tax is "+computeTax(rates, appliedAmount, status, income));


	}
	
	private static double computeTax(double[] r,int[][] aM,int s,int in) {
		double tax=0;
		tax = aM[s][0] * r[0] +
				(aM[s][1]-aM[s][0]) * r[1] +
				(aM[s][2]-aM[s][1]) * r[2] +
				(aM[s][3]-aM[s][2]) * r[3] +
				(aM[s][4]-aM[s][3]) * r[4] +
				(in-aM[s][4]) * r[5];
		return tax;
		
	}

}
