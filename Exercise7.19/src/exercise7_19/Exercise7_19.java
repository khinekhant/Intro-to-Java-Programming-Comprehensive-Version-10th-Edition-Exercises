package exercise7_19;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter values:");
		 int length=input.nextInt(); 
		 int[] list = new int[length];
		 
		    for(int i=0;i<list.length;i++){
		    	list[i]=input.nextInt();
		    }
		   

		    
		    System.out.println(isSorted(list));
	}
	private static boolean isSorted(int[] array){
		for(int i=0;i<array.length-1;i++){
		    if(array[i]>array[i+1]) return false;
		}
		return true;
	}

}
