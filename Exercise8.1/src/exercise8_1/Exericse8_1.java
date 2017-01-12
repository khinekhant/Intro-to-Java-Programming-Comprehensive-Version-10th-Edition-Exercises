package exercise8_1;

import java.util.Scanner;

public class Exericse8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter 3 by 4 matrix row by row");
final int NUM_ROW=3;
final int NUM_COL=4;

double[][] matrix=new double[NUM_ROW][NUM_COL];

for(int row=0;row<NUM_ROW ;row++){
	for(int col=0;col<NUM_COL;col++){
		matrix[row][col]=input.nextDouble();
	}
	
}
sumColumn(matrix);

	}

	private static void sumColumn(double[][] array) {
		// TODO Auto-generated method stub
		int col=0;
		
		while(col<4){
			double total=0;
		for(int row=0;row<array.length;row++){
			total+=array[row][col];
		}
			col++;
			System.out.println(total);
		
	}
	
		
	}

}
