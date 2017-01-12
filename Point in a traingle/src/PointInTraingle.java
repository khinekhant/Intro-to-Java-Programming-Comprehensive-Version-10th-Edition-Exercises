import java.util.Scanner;

public class PointInTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Scanner input=new Scanner(System.in);
System.out.println("Enter x and y coordinates");

double x=input.nextDouble();
double y=input.nextDouble();

if(x>0 && y>0 && (x+2*y<200)){
	System.out.println("Point in the traingle");
}else if((x==200/2) && (y==100/2) ){
	System.out.println("Point in the traingle(stay on line)");
}*/
	
	 Scanner input = new Scanner(System.in);
	    System.out.print("Enter the time zone offset to GMT: ");
	    long timeZoneOffset = input.nextInt();
	    
	    // Obtain the total milliseconds since the midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since the midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = (totalHours + timeZoneOffset) % 24;

	    // Display results
	    System.out.print("Current time is " + (currentHour % 12) + ":"
	      + currentMinute + ":" + currentSecond);
	    
	    if (currentHour < 12)
	      System.out.println(" AM");
	    else
	      System.out.println(" PM");    	
}
}
