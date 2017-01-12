package exercise7_27;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter list1: ");
		int size1=input.nextInt();
		int[] list1=new int[size1];
		for(int i=0;i<list1.length;i++){
			list1[i]=input.nextInt();
		}
		
		System.out.print("enter list2: ");
		int size2=input.nextInt();
		int[] list2=new int[size2];
		for(int i=0;i<list2.length;i++){
			list2[i]=input.nextInt();
		}
		
		//Arrays.sort(list1);
		//Arrays.sort(list2);
		
		System.out.println(equalsss(list1,list2) ? "Content is identical":"not identical");
		
	}

	private static boolean equalsss(int[] l1, int[] l2) {
		// TODO Auto-generated method stub
		if(l1.length!=l2.length){
			return false;
		}
		boolean r=false;
		for(int i=0;i<l1.length;i++){
			 r=false;
			for(int j=0;j<l2.length;j++){
				if (l1[i]==l2[j]){
					r=true;
				}
				
			}
			
			 
		}
		if(r) return true;
		return false;
		
		
	
	}

}
