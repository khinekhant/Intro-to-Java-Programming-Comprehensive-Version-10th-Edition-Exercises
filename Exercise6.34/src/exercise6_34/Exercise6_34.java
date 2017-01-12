package exercise6_34;

import java.util.Scanner;

public class Exercise6_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("enter the year :");
		int year=input.nextInt();
		System.out.print("enter month of the year :");
		int month=input.nextInt();
		printTitle(month, year);
		printBody(month, year);
	}
	
	
	
	private static void printTitle(int month,int year) {
		System.out.println("    "+getMonthName(month)+"    "+year);
		System.out.println("______________________________");
		
	}
	
	
	private static String getMonthName(int month) {
		// TODO Auto-generated method stub
		String monthName="";
		switch (month) {
		case 1:
			monthName="Jan";
			break;
		case 2:
			monthName="Feb";
			break;
		case 3:
			monthName="Mar";
			break;
		case 4:
			monthName="April";
			break;
		case 5:
			monthName="May";
			break;
		case 6:
			monthName="Jun";
			break;
		case 7:
			monthName="July";
			break;
		case 8:
			monthName="Aug";
			break;
		case 9:
			monthName="Sep";
			break;
		case 10:
			monthName="Oct";
			break;
		case 11:
			monthName="Nov";
			break;
		case 12:
			monthName="Dec";
			break;
		}
		return monthName;
	}
	
	private static void printBody(int month,int year){
		System.out.println("      Sun    Mon    Tues   Wed    Thurs    Fri    Sat ");
		int startDay=getStartDay(month,year);
		
		for(int i=0;i<startDay;i++){
			System.out.print("       ");
		}
		for(int i=1;i<=getNumofDaysInMonth(month,year);i++){
			if(i<10)System.out.print("       "+i);
			else System.out.print("     "+i);
			
			if((i+startDay)%7==0) System.out.println( );
		}
	}



	private static int getNumofDaysInMonth(int month, int year) {
		// TODO Auto-generated method stub
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
			      month == 8 || month == 10 || month == 12)
			      return 31;

	    if (month == 4 || month == 6 || month == 9 || month == 11)
			      return 30;
		if(month==2){
			if(isLeapYear(year))
				return 29;
			else return 28;
		}
		return 0;
	}



	private static boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		return (year%4==0 || year%400==0) && year%100!=0;
	}



	private static int getStartDay(int month, int year) {
		// TODO Auto-generated method stub
		return getDayofWeek(month,year,1);
	}



	private static int getDayofWeek(int month, int year, int dayOfMonth) {
		// TODO Auto-generated method stub
		
		if(month==1){
			month=13;
			year--;
		}else if(month==2){
			month=14;
			year--;
		}
		
		int j=year/100;
		int k=year%100;
		
		int dayOfWeek=(dayOfMonth+(26*(month+1))/10+k+k/4+j/4+5*j)%7;
		return dayOfWeek;
	}
	
	
	
	
	
	
	

}
