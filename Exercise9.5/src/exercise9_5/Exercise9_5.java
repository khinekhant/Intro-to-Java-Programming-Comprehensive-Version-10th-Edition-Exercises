package exercise9_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercise9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GregorianCalendar calendar=new GregorianCalendar();
System.out.println(calendar.getTime());

calendar.setTimeInMillis(1234567898765L);
System.out.println(calendar.get(Calendar.YEAR));
System.out.println(calendar.get(Calendar.MONTH));
System.out.println(calendar.get(calendar.DAY_OF_WEEK));

	}

}
