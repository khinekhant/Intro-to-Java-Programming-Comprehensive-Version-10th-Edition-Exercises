package exercise8_6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		final int NUM_ROW=3;
		final int NUM_COL=3;
		
		System.out.print("Enter matrix 1 ");
		double[][] matrix1=new double[NUM_ROW][NUM_COL];
		for(int row=0;row<NUM_ROW ;row++){
			for(int col=0;col<NUM_COL;col++){
				matrix1[row][col]=input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix 2 ");
		double[][] matrix2=new double[NUM_ROW][NUM_COL];

		for(int row=0;row<NUM_ROW ;row++){
			for(int col=0;col<NUM_COL;col++){
				matrix2[row][col]=input.nextDouble();
			}
			
		}
		double[][] result=multiply(matrix1, matrix2);
		display(matrix1);
		System.out.print("  "+"*"+"  ");
		display(matrix2);
		System.out.print("  "+"="+"  ");
		display(result);
		//System.out.println(Arrays.toString(matrix2));
		
	}
	
	private static double[][] multiply(double[][] a,double[][] b) {
		double[][]c=new double[a.length][a[0].length];
		for(int row=0;row<c.length ;row++){
			for(int col=0;col<c[row].length;col++){
				c[row][col]=a[row][col]*b[row][col];
			}
		}
		return c;
		
	}
	private static void display(double[][] array) {
		for(int row=0;row<array.length ;row++){
			for(int col=0;col<array[row].length;col++){
		       System.out.print((col+1)%array[row].length!=0 ? array[row][col]+" ":array[row][col]+"\n");
	}
		}
	}

}
