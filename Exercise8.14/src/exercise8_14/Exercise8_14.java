package exercise8_14;

import java.util.Scanner;

public class Exercise8_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for matrix ");
        int size = input.nextInt();
        
        int[][] matrix=new int[size][size];
        for(int row=0;row<matrix.length;row++){
        	int rNum=(int)(Math.random()*2);
        	for(int col=0;col<matrix[row].length;col++){
        		matrix[row][col]=rNum;
        	}
        }
        printMatrix(matrix);
        checkRow(matrix);
        checkCol(matrix);
        checkDiagonal(matrix);
        
	}

	private static void checkDiagonal(int[][] m) {
		// TODO Auto-generated method stub
		boolean allSame=true;
		for(int i=0;i<m.length-1;i++){
			if(m[i][i]!=m[i+1][i+1]){
				allSame=false;
				break;
			}
				
		}
		if(allSame) System.out.println("All "+m[0][0]+" in major diagonal");
		else System.out.println("No same number in a major diagonal");
	}

	private static void checkCol(int[][] m) {
		// TODO Auto-generated method stub
		for(int c=0;c<m[0].length;c++){
			boolean allSame=true;
			for(int r=0;r<m.length-1;r++){
				if(m[r][c]!=m[r+1][c]) {
					allSame=false;
					break;
				//else allSame=false;
				}
			}
			if(!allSame) System.out.println("No same number in a col");
			else System.out.println("All "+m[0][c]+" in col "+c);
				
		}
	}

	private static void checkRow(int[][] m) {
		// TODO Auto-generated method stub
		
		for(int r=0;r<m.length;r++){
			boolean allSame=false;
			for(int c=0;c<m[r].length-1;c++){
				if(m[r][c]==m[r][c+1]) allSame=true;
			}
			if(allSame) System.out.println("All "+m[r][0]+" in row "+r);
			else System.out.println("No same number in a row");
		}
	}

	private static void printMatrix(int[][] m) {
		// TODO Auto-generated method stub
		for(int i=0;i<m.length;i++){
			for(int c=0;c<m[i].length;c++){
				System.out.print((c+1)%m[i].length==0 ? m[i][c]+"\n":m[i][c]+" ");
			}
		}
	}

}
