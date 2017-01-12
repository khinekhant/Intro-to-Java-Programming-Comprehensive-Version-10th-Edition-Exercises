package exercise;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

		    System.out.print("Enter the amount: ");
		    String amountString = input.nextLine();
		    
		    int decimal=amountString.indexOf('.');
		    
		 int   amountInCents;
		    if(decimal==-1){
		    	amountInCents=Integer.parseInt(amountString);
		    }else{
		    	String numAfterDecimal=amountString.substring(decimal+1);
		    	if(numAfterDecimal.length()>2){
		    		 numAfterDecimal=numAfterDecimal.substring(0,2);
		    	}else if(numAfterDecimal.length()==1){
		    		numAfterDecimal+=0;
		    	}
		    	amountInCents=Integer.parseInt(amountString.substring(0, decimal)+numAfterDecimal);
		    }
		    
		    
		    int numofdollar=amountInCents/100;
		    int remainingAmount=amountInCents%100;
		    
		    int numOfQuarters=remainingAmount/25;
		    remainingAmount=remainingAmount%25;
		    
		    int numOfDiles=remainingAmount/10;
		    remainingAmount=remainingAmount%10;
		    
		    int numOfNickels=remainingAmount/5;
		    remainingAmount=remainingAmount%5;
		    
		    int numOfPennies=remainingAmount;
		    
		    System.out.println("You have "+ numofdollar+" dollars "+numOfQuarters+" quaters "+numOfDiles+" diles "+numOfNickels+" nickels "+
		    numOfPennies+" pennies.");
		    System.out.println(amountInCents);
	}

}
