package exercise;

import java.util.Random;
import java.util.Scanner;

import javax.rmi.CORBA.Tie;

public class ConvertCelciustoFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);


//---------------------- 2.1-----------//
/*System.out.println("Enter a degree in celsius: ");
int celcius=input.nextInt();

double farenheit=(9.0/5) * celcius +32;

System.out.println(celcius+" Celcius is "+farenheit+" Fahrenheit" );*/



//---------------------- 2.5-----------//
/*System.out.println("Enter the subtotal & gratuity rate: ");
 double subtotal=input.nextDouble();
 double gratuityRate=input.nextDouble();
 
 gratuityRate/=100;
 
 double gratuity=subtotal * gratuityRate;
 
double total=subtotal+gratuity;

System.out.println("The gratuity is "+ gratuity+" and total is "+total);
*/


//---------------------- 2.6----------//
/*System.out.println("Enter a number between 0 and 1000: ");
int number=input.nextInt();

//extract digit from hundreds
int extractDigit=number % 10;
int remainingvalue=number/10;

//extarct digit from tens
int extractDigit2=remainingvalue%10;
remainingvalue/=10;

//extarct digit from < 10 numbers
int extractDigit3=remainingvalue%10;

int sum=extractDigit+extractDigit2+extractDigit3;

System.out.println("Sum of the digit is "+sum);
*/


//---------------------- 2.7-----------//
/*final int year=365;

System.out.println("Enter the number of minutes: ");
int min=input.nextInt();

int minInaYear=60*24*365;

int numyear=min/minInaYear;
int remainingmin=min%minInaYear;

int numday=remainingmin/1440;
remainingmin%=1440;

int hour=remainingmin/60;
remainingmin %=60;

int currentmin=remainingmin;

int currentsec=remainingmin%60;

System.out.println(min+" minutes is about "+ numyear+" years "+
numday+" days"
);


//---------------------- 2.8-----------//
System.out.println("Enter the time sone offset to GMT:");
int offset=input.nextInt();

int currenthour=hour+offset;
System.out.println(currenthour+":"+currentmin+":"+currentsec);


*/
//---------------------- 2.8-----------//

/*System.out.println("Enter your monthly saving amount: ");
int monthlysaving=input.nextInt();

double monthlyInterestRate=0.00417;
double monthInterestAddon= monthlysaving*0.00417;

double monthtotal=monthlysaving+monthInterestAddon;

System.out.println("Enter the month for caculation: ");
int month=input.nextInt();
for(int i=2;i<=month;i++){
	monthtotal+=monthlysaving+(i*monthInterestAddon);
}

System.out.println(monthtotal);
*/


//---------------------- 2.14-----------//

/*System.out.println("Enter your weight in pound: ");
double weightInKg=input.nextDouble()*0.45359237;

System.out.println("Enter your height in inches: ");
double heightInMeter=input.nextDouble()*0.0254;


double bmi= weightInKg/ Math.pow(heightInMeter, 2);
System.out.println(weightInKg);
System.out.println(bmi);
*/

	
	
	Random generate=new Random();
	int num1=generate.nextInt(100);
	int num2=generate.nextInt(100);
	
	System.out.println("What is "+num1+" + "+num2);
	
	int answer=input.nextInt();

		System.out.println(num1+" + "+num2+" = "+answer+" is "+
		(num1+num2==answer));
	
	
	
	
}
	
	

}
