package exercise5_47;

import java.util.Scanner;

public class Exercise5_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter first 12 digits of ISBN number ");
       String isbn=input.nextLine();
      int total=0; 
       for(int i=0;i<=isbn.length()-1;i++){
    	   int num=isbn.charAt(i);
    	   if(i%2!=0) num*=3;
    	   total+=num;
       }
       
       int getISBN=10-total%10;
       
       if(getISBN==10) getISBN=0;
	   System.out.println(isbn+getISBN);
	}

}
