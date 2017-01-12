package exercise6_3;

import java.util.Scanner;

public class Exercise6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		 // Prompt the user to enter a string
		System.out.print("Enter number: ");
		int num = input.nextInt();
		int rnum=reverse(num);
		if(isPalidrone(num, rnum))
		System.out.println("Number is palidrone");
		else System.out.println("Number is not palidrone");

	}
	public static int reverse(int number){
		int reverse=0;
		
		while(number!=0){
			reverse*=10;
		      reverse+=number%10;
			    number/=10;
			  
		}
				return reverse ;
		
	
		
	}
	
	public static boolean isPalidrone(int num1, int num2){
		if(num1==num2) return true;
		else return false;
	}
	
	

}
