package exercise8_11;

import java.util.Scanner;

public class Exercise8_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] matrix = new int[3][3];

	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number between 0 and 511: ");
	        int num = input.nextInt();
	        String binary = decimalToBinary(num,matrix);

	        // put 1's and 0's using binary string
	        int index=0;
	        char ch;
	        for(int row=0;row<matrix.length;row++){
	        	for(int col=0;col<matrix[row].length;col++){
	        		matrix[row][col]=binary.charAt(index);
	        		index++;
	        		if(matrix[row][col]=='0')ch='H';
	        		else ch='T';
	        		System.out.print((col+1)%3==0? ch+"\n":ch+" ");
	        	}
	        }
	        	
	      }
	       

	    public static String decimalToBinary(int n,int[][] m) {
	    	String bi="";
	    	for(int i=0;i<(m.length*m[0].length);i++){
	    		int num=n%2;
	    		n/=2;
	    		bi=num+bi;
	    		
	    	}

	      return bi;
	    



	}

}
