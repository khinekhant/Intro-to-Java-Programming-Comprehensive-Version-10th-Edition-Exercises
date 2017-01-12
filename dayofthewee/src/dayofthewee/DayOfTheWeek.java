package dayofthewee;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter the year");
System.out.println("enter month of the year");
System.out.println("enter day of the month");
int year=input.nextInt();
int month=input.nextInt();
int day=input.nextInt();
int k=year%100;
int j=year/100;


int dayOfWeek=(day + 26*(month+1)/10 +k+ k/4+ j/4+5*j)%7;

System.out.println("Day of the week is"+ dayOfWeek);

	}

}
