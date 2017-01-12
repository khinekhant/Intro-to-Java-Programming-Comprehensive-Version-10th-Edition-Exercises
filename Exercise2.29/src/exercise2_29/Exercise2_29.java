package exercise2_29;

import java.util.Scanner;

public class Exercise2_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		  
	        System.out.print("Enter year ");
	        int year = input.nextInt();

	        System.out.print("Enter first day of Year: ");
	        int firstdayofyear = input.nextInt();
	        
	        
	        int numberOfDays=0;
	        String output="";
	        
	        for(int month=1;month<=12;month++){
	        	switch(month){
	        	case 1:
	        		numberOfDays=31;
	        		output="January "+year;
	        		break;
	        	case 2:
	        		if((year%4==0 && year%100!=0) || year%400==0)   numberOfDays=29;
	        		else numberOfDays=28;
	        		output="February "+year;
	        		break;
	        	case 3:
	        		numberOfDays=31;
	        		output="March "+year;
	        		break;
	        	case 4:
	        		numberOfDays=30;
	        		output="April "+year;
	        		break;
	        	case 5:
	        		numberOfDays=31;
	        		output="May "+year;
	        		break;
	        	case 6:
	        		numberOfDays=31;
	        		output="June "+year;
	        		break;
	        	case 7:
	        		numberOfDays=31;
	        		output="July "+year;
	        		break;
	        	case 8:
	        		numberOfDays=31;
	        		output="Augest "+year;
	        		break;
	        	case 9:
	        		numberOfDays=30;
	        		output="Sep "+year;
	        		break;
	        	case 10:
	        		numberOfDays=31;
	        		output="Oct "+year;
	        		break;
	        	case 11:
	        		numberOfDays=30;
	        		output="Nov "+year;
	        		break;
	        	case 12:
	        		numberOfDays=31;
	        		output="Dec "+year;
	        		break;
	        	}
	        	System.out.println("\t\t\t"+output+"\t\t\t");
	        	System.out.println("_____________________________________________________________");
	        	System.out.printf("%-8s%-8s%-8s%-10s%-10s%-9s%-8s","Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday",
	        			"Saturday");
	        	System.out.println();
	        	
	        	int count=0;
	        	final int NUMBER_PERLINE=7;
	        	int firstday= (firstdayofyear+numberOfDays)%7;
	        	
	        	for(int i=0;i<=firstday;i++){
	        		System.out.printf("%-8s"," "); 
	        		count++;
	        	}
	        	for(int j=1;j<=numberOfDays;j++){
	        		if(count++ % NUMBER_PERLINE!=0) System.out.printf("%-9d", j);
		        	else System.out.println("  "+j);
		        		
	        	}
	        	
	        	
	        	System.out.println();
	        	
	        	
	        	
	        }
	}

}
