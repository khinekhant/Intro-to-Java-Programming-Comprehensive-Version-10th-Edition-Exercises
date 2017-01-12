package exercise8_17;

import java.util.Scanner;

public class Exercise8_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int numBanks=input.nextInt();
		double limit =input.nextDouble();
		
		double[][] borrowers=new double[numBanks][numBanks];
		double[] cBalance=new double[numBanks];
		
		for(int i=0;i<cBalance.length;i++){
			//read the current balance
			cBalance[i]=input.nextDouble();
			//read the number of borrowers
			int numOfBorrower=input.nextInt();
			for(int j=0;j<numOfBorrower;j++) {
				int borrowerID=input.nextInt();
				borrowers[i][borrowerID]=input.nextDouble();
			}
		}
		//if(!checkBank(cBalance,borrowers,limit)){
			
		int index=0;
		for(int row=0;row<borrowers.length;row++){
			double total=0.0;
			for(int col=0;col<borrowers[row].length;col++){
				total+=borrowers[row][col];
				
			}
			total+=cBalance[row];
			if(total<limit){
				index=row;
			}
			
		}
		changeToZero(borrowers,index);
		
		checkBank(cBalance, borrowers, limit);
				
		

	}

	private static void changeToZero(double[][] b, int index) {
		// TODO Auto-generated method stub
		for(int i=0;i<b.length;i++)
			b[i][index]=0;
	}

	private static void checkBank(double[] cB, double[][] b, double l) {
		// TODO Auto-generated method stub
		System.out.print("Unsafe banks are ");
		for(int i=0;i<cB.length;i++){
			//boolean safe;
			double total=0;
			for(int j=0;j<b[i].length;j++){
				total+=b[i][j];
			}
			total+=cB[i];
			if(total<l) System.out.print(i+" ");;
			
		}
		//return true;
	
	
	}

}
