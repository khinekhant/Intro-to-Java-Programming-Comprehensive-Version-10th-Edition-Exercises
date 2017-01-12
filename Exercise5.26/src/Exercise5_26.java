import java.util.Scanner;

public class Exercise5_26 {
	/*
	 * Write a program that prompts the user to
	enter the year and first day of the year, and displays the first day of each month
	in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
	January 1, 2013, your program should display the following output:
	January 1, 2013 is Tuesday
	...
	December 1, 2013 is Sunday*/
	
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
	        		output="January 1 "+year+" is ";
	        		break;
	        	case 2:
	        		if((year%4==0 && year%100!=0) || year%400==0)   numberOfDays=29;
	        		else numberOfDays=28;
	        		output="February 1 "+year+" is ";
	        		break;
	        	case 3:
	        		numberOfDays=31;
	        		output="March 1 "+year+" is ";
	        		break;
	        	case 4:
	        		numberOfDays=30;
	        		output="April 1 "+year+" is ";
	        		break;
	        	case 5:
	        		numberOfDays=31;
	        		output="May 1 "+year+" is ";
	        		break;
	        	case 6:
	        		numberOfDays=31;
	        		output="June 1 "+year+" is ";
	        		break;
	        	case 7:
	        		numberOfDays=31;
	        		output="July 1 "+year+" is ";
	        		break;
	        	case 8:
	        		numberOfDays=31;
	        		output="Augest 1 "+year+" is ";
	        		break;
	        	case 9:
	        		numberOfDays=30;
	        		output="Sep 1 "+year+" is ";
	        		break;
	        	case 10:
	        		numberOfDays=31;
	        		output="Oct 1 "+year+" is ";
	        		break;
	        	case 11:
	        		numberOfDays=30;
	        		output="Nov 1 "+year+" is ";
	        		break;
	        	case 12:
	        		numberOfDays=31;
	        		output="Dec 1 "+year+" is ";
	        		break;
	        	}
	        	int firstday= (firstdayofyear+numberOfDays)%7;
	        	System.out.println(numberOfDays);
	          	 switch(firstday){
	          	 case 0:
	          		 System.out.println(output+" Sunday");
	          		break;
	          	 case 1:
	          		 System.out.println(output+" Monday");
	          		break;
	          	 case 2:
	          		 System.out.println(output+" tuesday");
	          		break;
	          	 case 3:
	          		 System.out.println(output+" Wednesday");
	          		break;
	          	 case 4:
	          		 System.out.println(output+" Thursday");
	          		break;
	          	 case 5:
	          		 System.out.println(output+" Friday");
	          		break;
	          	 case 6:
	          		 System.out.println(output+" Saturday");
	          		break;
	          	
	        	 }
	        
	        }
	       
	}

}
