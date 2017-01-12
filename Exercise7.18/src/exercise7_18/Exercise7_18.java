package exercise7_18;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 Scanner input = new Scanner(System.in);
	    double[] list = new double[10];
	    System.out.print("Enter 10 double values: ");

	    int i = 0;
	    while (i < list.length) {
	      list[i] = input.nextDouble();
	      i++;
	    }
	    
	    long startTime=System.currentTimeMillis();
	    System.out.println(Arrays.toString(bubbleSort(list)));
	    long endTime=System.currentTimeMillis();
	    System.out.println(endTime-startTime);
	}

	/*private static double[] bubbleSort(double[] array) {
		// TODO Auto-generated method stub
		double temp=0.0;
		//boolean swapped=false;
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1;j++){
			if(array[j]>array[j+1]){
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				//swapped=true;
				
			}
		  }
			//if(swapped==false) break;
		}
		
		
		return array;
	}*/
	 static double[] bubbleSort(double[] list) {
		    boolean changed = true;
		    do {
		      changed = false;
		      for (int j = 0; j < list.length - 1; j++)
		        if (list[j] < list[j+1]) {
		          //swap list[j] wiht list[j+1]
		          double temp = list[j];
		          list[j] = list[j + 1];
		          list[j + 1] = temp;
		          changed = true;
		        }
		    } while (changed);
		    
		    return list;
		  }

}
