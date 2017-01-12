package exercise10_5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the number: ");
int num=input.nextInt();

PrimeFactor pFactor=new PrimeFactor(num);
System.out.println(new StringBuilder(pFactor.getPrimeFactor().toString()).reverse());

	}

}
