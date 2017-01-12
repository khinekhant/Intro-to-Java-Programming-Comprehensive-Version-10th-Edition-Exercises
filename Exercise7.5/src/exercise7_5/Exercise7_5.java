package exercise7_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.print("enter 10 numebrs:");
		int[] distinctNum=new int[10];
		int count=0;
		int nums;
		
		for(int i=0;i<distinctNum.length;i++){
		nums=input.nextInt();
		
			if(isDistinct(distinctNum, nums)){
				distinctNum[count]=nums;
			    count++;
			}
		}
				    
			
		
		
		System.out.println(count+" distinct nums");
		for(int i=0;i<distinctNum.length;i++)
			if(distinctNum[i]>0)
		System.out.println(distinctNum[i]);
		
		
	}
	private static boolean isDistinct(int[] array,int num){
		for(int i=0;i<array.length;i++){
			if(num!=array[i]){
				return true;   
			}
			if(true) break;
			//else		
	}
		return false;

	}	

}
