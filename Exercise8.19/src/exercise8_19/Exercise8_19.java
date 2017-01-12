package exercise8_19;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Exercise8_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter num of row and cols: ");
		int r=input.nextInt();
		int c =input.nextInt();
		
		int[][] numbers=new int[r][c];
		
		System.out.println("Enter value for "+r+" rows "+c+" cols ");
		for(int row=0;row<numbers.length;row++){
			for(int col=0;col<numbers[row].length;col++){
				numbers[row][col]=input.nextInt();
	}
		}
		
		System.out.println(checkHori(numbers));
		System.out.println(checkVerti(numbers));
		System.out.println(checkDiagonal(numbers));
	}

	private static boolean checkDiagonal(int[][] values) {
		// TODO Auto-generated method stub
		/*int count=0;
		for(int row=0;row<nums.length-1;row++){
			for(int col=row-2;col<row-1;col++){
			if(nums[row][col]==nums[row+1][col+1]) count++;
			else if(nums[row][col]!=nums[row+1][col+1]) count=0;
		}
		
		if(count==3){
			return true;
		}
		}
		return false;
	}*/
	for (int i = 0; i < values.length; i++) {
		   int start = values[i][0];
		   int count = 0;
		   for (int j = i+1, k = 1; j < values.length && k < values[0].length; j++, k++) {
		    if (start == values[j][k]) {
		     count++;
		    } else {
		    // start = values[j][k];
		     count = 0;
		    }
		    if (count == 3) {
		     return true;
		    }
		   }
		  }
		 
		  // Going through the column
		   
		  for (int i = 0; i < values[0].length; i++) {
		   int start = values[0][i];
		   int count = 0;
		   for (int j = i+1, k = 1; j < values[0].length && k < values.length; j++, k++) {
		    if (start == values[k][j]) {
		     count++;
		    } else {
		    // start = values[k][j];
		     count = 0;
		    }
		 
		    if (count == 3) {
		     return true;
		    }
		   }
		  }
		 
		  // From upper right to lower left
		  // Go through the column
		   
		  for (int i = 0; i < values[0].length; i++) {
		   int start = values[0][i];
		   int count = 0;
		   for (int j = 1, k = i-1; j < values.length && k >= 0; j++, k--) {
		    if (start == values[j][k]) {
		     count++;
		    } else {
		     //start = values[j][k];
		     count = 0;
		    }
		    if (count == 3) {
		     return true;
		    }
		   }
		  }
		 
		  // Going through the row
		   
		  for (int i = 0; i < values.length; i++) {
		   int start = values[i][values[i].length-1];
		   int count = 0;
		   for (int j = i+1, k = values[0].length-2; j < values.length && k >= 0; j++, k--) {
		    if (start == values[j][k]) {
		     count++;
		    } else {
		    // start = values[j][k];
		     count = 0;
		    }
		    if (count == 3) {
		     return true;
		    }
		   }
		  }
		   
		  return false;
		 
		 }

	private static boolean checkVerti(int[][] nums) {
		// TODO Auto-generated method stub
		for(int col=0;col<nums[0].length;col++){
			//boolean same=false;
			int count=0;
			for(int row=0;row<nums.length-1;row++){
					if(nums[row][col]==nums[row+1][col]) count++;
					else if(nums[row][col]!=nums[row+1][col]) count=0;
				}
			if (count==3) {
				//System.out.println(nums[col]);
				return true;
			}
		}
		return false;
		
	}

	private static boolean checkHori(int[][] nums) {
		// TODO Auto-generated method stub
		
		for(int row=0;row<nums.length;row++){
			//boolean same=false;
			int count=0;
			for(int col=0;col<nums[row].length-1;col++){
					if(nums[row][col]==nums[row][col+1]) count++;
					else if(nums[row][col]!=nums[row][col+1]) count=0;
				}
			if (count==3) return true;
		}
		return false;
	}

}
