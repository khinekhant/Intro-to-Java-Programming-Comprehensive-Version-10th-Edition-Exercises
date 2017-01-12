package exercise12_1;

import java.util.Scanner;

public class Exercise12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the caculation: ");
		double a=input.nextDouble();
		input.nextLine();
		String oper=input.next();
		double b=input.nextDouble();
		double ans=0;
		if(isNumeric(String.valueOf(a)) && isNumeric(String.valueOf(b))){
		switch (oper) {
		case "+":
			ans=a+b;
			break;
		case "-":
			ans=a-b;
			break;
		case "*":
			ans=a*b;
			break;
		case "/":
			ans=a/b;
			break;
		
		}
		}
		
		System.out.print(a+oper+b+" ="+ans);
		

	}
	
 public static boolean isNumeric(String num1){
	 char[] ch=num1.toCharArray();
	 for(char c:ch){
			if(Character.isDigit(c)) return true;
	 }
	 return false;	
 }
		
	

}
