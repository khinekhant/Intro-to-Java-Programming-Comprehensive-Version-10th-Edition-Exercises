package exercise6_31;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Exercise6_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Enter credit card number :");
long credit=input.nextLong();

if(isValid(credit)) System.out.println("Valid");
else System.out.println("Invalid");

System.out.println(getSize(credit));
System.out.println(isPrefixMatch(credit));


	}
	
	private static boolean isValid(long number) {
		if(getSize(number)>16 || getSize(number)<13) return false;
		
		if(!isPrefixMatch(number)) return false;
		int sum=sumOfDoubleEvenPalaces(number)+sumOfOddPlaces(number);
		System.out.println(sum%10);
		if(sum%10 != 0) return false;
		
		return true;
		
	}

	private static int getSize(long d) {
		// TODO Auto-generated method stub
		int numOfD=0;
		while(d>0){
			d/=10;
			numOfD++;
		}
		
		return numOfD;
	}
	
	private static int sumOfDoubleEvenPalaces(Long number){
		int sum=0;
		int digit;
		int evenPlaceNum;
		while(number>0){
			number/=10;
			evenPlaceNum=(int)(number%10);
			digit=getDigit(evenPlaceNum);
			sum+=digit;	
			number/=10;
		}
		
		return sum;
	}
	
	
	private static int getDigit(int number){
		int num=number*2;
		return (num>9) ? num-9:num;
	}
	
	
	private static int sumOfOddPlaces(long number){
		int sum=0;
		while(number>0){
			int oddPlaceNum=(int)(number%10);
			sum+=oddPlaceNum;
			number/=100;
			
		}
		
		return sum;
	}
	
	//private static boolean prefixedMatch(long number,int d)
	
	private static boolean isPrefixMatch(long number){
		String num=String.valueOf(number);
		char ch1=num.charAt(0);
		char ch2=num.charAt(1);
		if(ch1=='4' || ch1=='6' || ch1=='5' ||(ch1=='3' && ch2=='7')) return true;
		return false;
		
	}
	

}
