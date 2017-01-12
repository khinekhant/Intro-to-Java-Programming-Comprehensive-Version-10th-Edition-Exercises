package exercise6_6;

import java.util.Scanner;

public class Exercise6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		 // Prompt the user to enter a string
		System.out.print("Enter number: ");
		int num = input.nextInt();
		displayPattern(num);
		System.out.println(Math.pow(1+.0075, 12));
		

	}
	
	public static void displayPattern(int num){
		for(int i=1;i<=num;i++){
			for(int j=i;j<num;j++){
				System.out.print(" ");
			}
			for(int k=i;k>0;k--){
				System.out.print(k);
			}
			System.out.println();
		}
		
		
	}

}
