package exercise12_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num1=0;
		int num2=0;
		boolean t=false;
		
		System.out.println("Enter two integers: ");
		
		
		while(!t){
			try{
			num1=scanner.nextInt();
			num2=scanner.nextInt();
			t=true;
			//scanner.close();
			}catch(InputMismatchException e){
				e.printStackTrace();
				System.out.println("Input invalid. Enter two integers: ");
				scanner.nextLine();
			}
			
		}
		
		System.out.println("Sum is"+(num1+num2));
		

	}

}
