package exericse7_15;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("enter 10 numebrs: ");
		
		int[] numbers=new int[10];
		int num;
		for(int i=0;i<numbers.length;i++){
			num=input.nextInt();
			numbers[i]=num;
		}
		
		System.out.println(Arrays.toString(eliminateDuplicate(numbers)));

	}

	private static int[] eliminateDuplicate(int[] num) {
		// TODO Auto-generated method stub
		int[] distinctNum=new int[num.length];
		int count=0;
		for(int i=0;i<num.length;i++){
			if(distinctNum[num[i]-1]==0){
				distinctNum[count]=num[i];
				count++;

			}
			
		}
		return distinctNum;
	}

}
