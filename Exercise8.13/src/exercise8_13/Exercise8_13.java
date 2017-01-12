package exercise8_13;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        System.out.print("Enter rows and cols: ");
	        int row = input.nextInt();
	        int col=input.nextInt();
	        
	        System.out.println("Enter the array: ");
	        double[][] numbers=new double[row][col];
	        for(int i=0;i<numbers.length;i++ ){
	        	for(int j=0;j<numbers[i].length;j++){
	        		numbers[i][j]=input.nextDouble();
	        	}
	        }
	        
	    int[] index= findLargest(numbers);
	    System.out.print(Arrays.toString(index));
	}

	private static int[] findLargest(double[][] n) {
		// TODO Auto-generated method stub
		int rI=0;
		int cI=0;
		//int[] largest=new int[2];
		
		for(int i=0;i<n.length;i++){
			for(int j=0;j<n[i].length;j++){
				if(n[i][j]>n[rI][cI]){
					rI=i;
					cI=j;
				}
			}
			
		}
		return new int[]{rI,cI};
	}
	

}
