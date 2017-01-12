package exercise7_32;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter list:");
		  int[] list1 = new int[input.nextInt()];
		  for (int i = 0; i < list1.length; i++) {
		   list1[i] = input.nextInt();
		  }
		   
		  partition(list1);
		   
		  System.out.print("After the partition, the list is ");
		   
		  for (int i = 0; i < list1.length; i++) {
		   System.out.print(list1[i] + " ");
		  }
		 
		 }
		  
		 public static int partition(int[] list) {
		/*  int pivot= list[0];
		  int partitionLocation = 0;
		  int hi = list.length-1;
		   
		  while(partitionLocation < hi) {
		    
		   if(pivot>=list[partitionLocation+1]) {
		    //swap partition and the next item
		    list[partitionLocation] = list[partitionLocation+1];
		    list[partitionLocation+1] = pivot;
		    partitionLocation++;
		    
		   } else {
		    //move the item to the end of the list
		    int temp = list[hi];
		    list[hi]=list[partitionLocation+1];
		    list[partitionLocation+1] = temp;
		    hi--;
		       
		   }
		   System.out.println(Arrays.toString(list));
		   System.out.println(pivot);
		  
		  }
		  System.out.println(partitionLocation);
		  return partitionLocation;
		  
		 */
				int first = 0;
			  	int last = list.length - 1;
			    int pivot = list[first]; // Choose the first element as the pivot
			    int low = first + 1; // Index for forward search
			    int high = last; // Index for backward search

			    while (high >= low) {
			      // Search forward from left
			      while (low < high && list[low] <= pivot)
			        low++;

			      // Search backward from right
			      while (low < high && list[high] > pivot)
			        high--;

			      // Swap two elements in the list
			      if (high > low) {
			        int temp = list[high];
			        list[high] = list[low];
			        list[low] = temp;
			      }
			      
			      if(high==low){
			    	  int l=low-1;
			    	  list[first]=list[l];
			    	  list[l]=pivot;
			    	  return l; 
			      }
			    	 
			      }
			    return first;
			    }

			   /* while (high > first && list[high] >= pivot)
			      high--;
			    System.out.println(list[low]);
			    System.out.println(list[low+1]);
			    System.out.println(Arrays.toString(list));

			    // Swap pivot with list[high]
			    if (pivot > list[low]) {
			      list[first] = list[low];
			      list[low] = pivot;
			      return low;
			    }
			    else {
			      return first;
			    }
			  */
	

}
