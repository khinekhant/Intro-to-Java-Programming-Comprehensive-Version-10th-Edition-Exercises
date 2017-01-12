package datevalid;
import java.util.Date;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;
public class datevalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the date");
		String dt=input.nextLine();
		                
		                //String dt = "02/29/2004";  //Valid Date
		                try
		                {
		                        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		                        df.setLenient(false);  // this is important!
		                        Date dt2 = df.parse(dt);
		                        System.out.println("Date is ok = " + dt2);
		                }
		                catch (ParseException e)
		                {
		                        System.out.println("Invalid date " + dt);
		                }
		                catch (IllegalArgumentException e)
		                {
		                        System.out.println("Invalid date " + dt);
		                }
		        }
		

	}



