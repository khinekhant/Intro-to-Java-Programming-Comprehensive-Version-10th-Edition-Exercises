package exercise8_20;

import java.util.Scanner;
import java.util.prefs.BackingStoreException;

public class exercise8_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[][] gameBoard=new int[6][7];
		
		
		int maxDisk=6*7;
		char player='\u0000';
		for(int countDisk=0;countDisk<maxDisk|| !isCFour(gameBoard);countDisk++){
			if(countDisk%2==0){
				player='r';
			}else {
				player='y';
			}
		System.out.println("Enter a "+ (player=='r'? "red ":"yellow ")+"disk at column(0-6)" );
		int column=input.nextInt();
		for(int row=gameBoard.length-1;row>=0;row--){
			if(gameBoard[row][column]=='\u0000'){
				gameBoard[row][column]=player;
				break;
			}
			if(row==0) System.out.println("Column "+column+" is full, try another column");
		}
		
		showGameBoard(gameBoard);
		
		}
		if(isCFour(gameBoard)) 
		{
		System.out.println("Player "+(player=='r' ? "red":"yellow")+" has won");
		System.exit(0);
		}else {
		System.out.println("The game end with a draw");
		System.exit(1);
	}
	}

	private static void showGameBoard(int[][] gameBoard) {
		// TODO Auto-generated method stub
		for(int row=0;row<gameBoard.length;row++){
			System.out.print("|");
			for(int col=0;col<gameBoard[row].length;col++){
				if(gameBoard[row][col]=='r') System.out.print("r|");
				else if(gameBoard[row][col]=='y') System.out.print("y|");
				else System.out.print(" |");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
			
		
	}
	

	private static boolean isCFour(int[][] gB) {
		// TODO Auto-generated method stub
		
		return checkHori(gB)||checkVerti(gB)|| checkDiagonal(gB);
	}
	

	private static boolean checkVerti(int[][] gB) {
		// TODO Auto-generated method stub
		for(int col=0;col<gB[0].length;col++){
			//boolean same=false;
			int count=0;
			for(int row=0;row<gB.length-1;row++){
					if(gB[row][col]==gB[row+1][col]) count++;
					else if(gB[row][col]!=gB[row+1][col]) count=0;
				}
			if (count==3) {
				//System.out.println(nums[col]);
				return true;
			}
		}
		return false;
		
	}

	private static boolean checkHori(int[][] gB) {
		// TODO Auto-generated method stub
		
		for(int row=0;row<gB.length;row++){
			//boolean same=false;
			int count=0;
			for(int col=0;col<gB[row].length-1;col++){
					if(gB[row][col]==gB[row][col+1]) count++;
					else if(gB[row][col]!=gB[row][col+1]) count=0;
				}
			if (count==3) return true;
		}
		return false;
	}
	
	private static boolean checkDiagonal(int[][] gB) {
		// TODO Auto-generated method stub
		for(int row=0;row<gB.length-1;row++){
			int toCompare=gB[row][0];
			int count=0;
			for(int r=row+1,c=1;r<gB.length;r++,c++){
				if(toCompare==gB[r][c]) count++;
				else count=0;
			}
			if(count==3) return true;
		}
		
		for(int col=0;col<gB[0].length;col++){
			int toCompare=gB[0][col];
			int count=0;
			for(int r=1,c=col+1;r<gB.length && c<gB[0].length;r++,c++){
				if(toCompare==gB[r][c]) count++;
				else count=0;
			}
			if(count==3) return true;
		}
		
		for(int row=gB.length-1;row>=0;row--){
			int toCompare=gB[row][6];
			int count=0;
			for(int r=row-1,c=5;r<gB.length && c>=1;r--,c--){
				if(toCompare==gB[r][c]) return true;
				else count=0;
			}
			if(count==4) return true;
		}
		
		return false;
	}
	

}
