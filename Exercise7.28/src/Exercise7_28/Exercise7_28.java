package Exercise7_28;

import java.awt.List;
import java.util.Scanner;

public class Exercise7_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
	    System.out.print("enter 10 numbers: ");
	    int[] list=new int[10];
	    for(int i=0;i<list.length;i++){
			list[i]=input.nextInt();
		}
	    
	    for(int i=0;i<list.length;i++){
	    	for(int j=i;j<list.length;j++){
	    		System.out.println(list[i]+" + "+list[j]+"= "+(list[i]+list[j]));
	    	}
	    }
	}

}
