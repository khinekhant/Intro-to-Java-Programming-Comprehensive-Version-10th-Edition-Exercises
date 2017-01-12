package exercise9_13;

import java.util.Scanner;

public class Exercise9_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row and column: ");
		int row=input.nextInt();
		int column=input.nextInt();
		System.out.println("Enter the array: ");
		double[][] loca=new double[row][column];
		for(int r=0;r<loca.length;r++){
			for(int c=0;c<loca[r].length;c++){
				loca[r][c]=input.nextDouble();
			}
		}
		
		Location location=Location.locateLargest(loca);
		System.out.println("The largest element is "+location.maxValue+
				" and locate at "+location.row+","+location.column);

	}

}
