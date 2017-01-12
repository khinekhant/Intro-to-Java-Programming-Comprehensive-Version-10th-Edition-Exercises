package exercise6_22;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class Exercise6_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		long num=input.nextInt();
		
		System.out.println("The square root of "+num+" is "+sqrt(num));

	}

	private static double sqrt(long num) {
		// TODO Auto-generated method stub
		double iniGuess=1.0;
		double lastGuess=iniGuess;
		
		double diff;
		double nextGuess;
		
		do{
			nextGuess=(lastGuess+num/lastGuess)/2;
			diff=nextGuess-lastGuess;
			if(diff<0.0001) return nextGuess;
			else lastGuess=nextGuess;
		}while(diff>0.001);
					
			
		return 0.0;
	}

}
