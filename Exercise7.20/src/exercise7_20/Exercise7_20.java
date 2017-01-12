package exercise7_20;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int[] list = new int[10];
	    System.out.print("Enter 10 double values: ");

	    int i = 0;
	    while (i < list.length) {
	      list[i] = input.nextInt();
	      i++;
	    }
	    
	    System.out.println(Arrays.toString(selectionSort(list)));
	}
	
	private static int[] selectionSort(int[] array){
		for(int i=array.length-1;i>0;i--){
			int currentMax=array[i];
			int currentMaxIndex=i;
			for(int j=0;j<i;j++){
				if(currentMax<array[j]){
					currentMax=array[j];
					currentMaxIndex=j;
				}
				
			}
			if(currentMaxIndex!=i){
				array[currentMaxIndex]=array[i];
				array[i]=currentMax;
			}
			
		}
		return array;
	}

}
