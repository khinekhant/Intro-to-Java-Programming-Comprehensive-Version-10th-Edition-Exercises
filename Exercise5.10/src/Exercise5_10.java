
/*
 * (Find numbers divisible by 5 and 6) Write a program that displays all the numbers
from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
separated by exactly one space.
*/

public class Exercise5_10 {
	public static void main(String[] args){
		 
	int num;
	final int NUMBER_PERLINE=10;
	int count=1;
	for(int i=100;i<1000;i++){
		if(i%5==0 && i%6==0) {
		num=i;
		 System.out.print(count++%NUMBER_PERLINE!=0? num+" ":num+"\n");	
		}
	}
		/*int i = 1;

	    while (i * i <= 12000 ) {
	      i++;
	      System.out.println("This number is " + i);
	    }*/

	   
	
 }

}
