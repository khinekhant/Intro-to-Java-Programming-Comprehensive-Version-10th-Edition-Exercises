package exrcise7_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.print.attribute.Size2DSyntax;

public class Exercise7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXSIZE=100;
		Scanner input =new Scanner(System.in);
		int[] size=new int[MAXSIZE];
		int userInput=0;
		int userValue;
		
		System.out.print("enter numbers between 1 to 100, input end with 0 :");
		do{
		 userValue =input.nextInt();
		 size[userInput]=userValue;
		 userInput++;
		}while((userValue>=1 && userValue<=100) && userInput<100);
		
		
		
		int[] fuckoff=newArray(size);
		
		for(int i=0;i<fuckoff.length;i++){
			if(fuckoff[i]>0){
			System.out.print(i+1+" occurs "+fuckoff[i]);
			System.out.print(fuckoff[i]>1? "times":"time");
			System.out.println();
			}
			
		}
		/*for(int i=0;size[i]>0;i++){
			int count=1;
			int number=0;
			for(int j=i+1;size[j]>0;j++){
				if(size[i]==size[j]){
					number=size[i];
					count++;
					
				}
				
				
			}
			
			System.out.print(number+" occurs "+count );
			
			System.out.println();
		}
		*/
	
}
	private static int[] newArray(int[] array) {
		int[] counts=new int[array.length];
		for(int i=0;array[i]>0;i++){
			if(array[i]>=1 && array[i]<=100)
				counts[array[i]-1]++;
			
		}
		
		return counts;
		
	}


}
