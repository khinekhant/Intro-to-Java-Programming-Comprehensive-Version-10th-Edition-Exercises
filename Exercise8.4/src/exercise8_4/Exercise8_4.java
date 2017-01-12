package exercise8_4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

import org.omg.CORBA.Current;

public class Exercise8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 4 by 4 matrix row by row");
		final int NUM_ROW=8;
		final int NUM_COL=8;

		double[][] weeklyHours={
			      {2, 4, 3, 4, 5, 8, 8},
			      {7, 3, 4, 3, 3, 4, 4},
			      {3, 3, 4, 3, 3, 2, 2},
			      {9, 3, 4, 7, 3, 4, 1},
			      {3, 5, 4, 3, 6, 3, 8},
			      {3, 4, 4, 6, 3, 4, 4},
			      {3, 7, 4, 8, 3, 8, 4},
			      {6, 3, 5, 9, 2, 7, 9}};
;

		/*for(int row=0;row<NUM_ROW ;row++){
			for(int col=0;col<NUM_COL;col++){
				weeklyHours[row][col]=input.nextDouble();
			}
			
		}*/
		double[] sum=sum(weeklyHours);
		int[] index=new int[sum.length];
		
		for(int i=0;i<sum.length;i++){
			index[i]=i;
		}
		
		sort(sum,index);
		for(int i=0;i<sum.length;i++)
		System.out.println("Employee "+index[i]+" work hours is "+sum[i]);
	}

	private static double[] sum(double[][] wHours) {
		// TODO Auto-generated method stub
		double[] array=new double[wHours.length];
		for(int i=0;i<wHours.length;i++){
			double sum=0;
			for(int j=0;j<wHours[i].length;j++){
				sum+=wHours[i][j];
			}
			array[i]=sum;
		}
		return array;

		
			  }
	
	private static void sort(double[] array,int[] inList) {
		for(int i=0;i<array.length-1;i++){
			int currentMaxIndex=i;
			double currentMaxV=array[currentMaxIndex];
		
			for(int j=i+1;j<array.length;j++){
				if(currentMaxV<array[j]){
					currentMaxIndex=j;
					
					currentMaxV=array[currentMaxIndex];
				}
				
			}
			
			if(currentMaxIndex!=i){
				//swap hours sum
				array[currentMaxIndex]=array[i];
				array[i]=currentMaxV;
				
				//swap index
				int temp=inList[currentMaxIndex];
				inList[currentMaxIndex]=inList[i];
				inList[i]=temp;
			}
			
		}
		//return array;
		
	}
	


}
