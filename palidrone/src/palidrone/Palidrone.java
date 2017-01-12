package palidrone;

import java.util.Scanner;

public class Palidrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		int remainder;
		int sum=0;
	
		int temp=num;
		while(num>0){
			remainder=num%10;
			sum=sum*10+remainder;	
			num=num/10;
		}
	
		if(sum==temp){
			System.out.println(sum+" = "+temp+" it is a palidrome numebr");
		}
	}

}
