import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Enter a year (2014): " );
int year = input.nextInt();
System.out.print("Enter a month (Jul): " );
String month = input.next();


boolean isLeapYear=year%4==0 || year%400==0 || year%100!=0;
int daysInMonth=0;
switch (month) {
case "Jan":
	daysInMonth=31;
	break;
case "Feb":
 daysInMonth=isLeapYear? 29:28;
 break;
 case "Mar":
	 daysInMonth=31;
	 break;
 case "Apr":
	 daysInMonth=30;
	 break;
 case "May":
	 daysInMonth=31;
	 break;
 case "Jun":
	 daysInMonth=30;
	 break;
 case "Jul":
	 daysInMonth=31;
	 break;
 case "Aug":
	 daysInMonth=31;
	 break;
 case "Sep":
	 daysInMonth=30;
 case "Oct":
	 daysInMonth=31;
	 break;
 case "Nov":
	 daysInMonth=30;
	 break;
 case "Dec":
	 daysInMonth=31;
	 break;
	
default:
	System.out.println("Invalid Input");
	break;
}

System.out.println(month+" "+year+" has "+daysInMonth+" days.");
	}

}
