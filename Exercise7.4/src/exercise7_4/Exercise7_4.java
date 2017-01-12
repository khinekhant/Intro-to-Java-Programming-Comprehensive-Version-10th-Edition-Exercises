package exercise7_4;

import java.util.Scanner;

public class Exercise7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX=100;
		int[] scores=new int[MAX];
		Scanner input =new Scanner(System.in);
		System.out.print("enter scores(input end with negative number :");
		
		int number;
		int index=0;
		do{
			number=input.nextInt();
			scores[index]=number;
			index++;
		}while(index<100 && number>0);
		
		int average=compute(scores,index);
		
		int count=0;
		int count1=0;
		int count2=0;
		
		for(int i=0;scores[i]>0;i++){
		if(scores[i]>average) count++;
		else if(scores[i]<average) count1++;
		else if(scores[i]==average) count2++;
		}
		System.out.print("> "+count+"\n < "+count1+"\n = "+count2);
		
		
	}
	
	private static int compute(int[] array,int index) {
		int total=0;
		for(int i=0;i<array.length;i++){
			total+=array[i];
		}
		
		int average=total/index;
		
		return average;
	}

}
