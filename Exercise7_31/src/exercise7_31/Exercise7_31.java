package exercise7_31;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Enter list1: ");
int size1=input.nextInt();
int[] list1=new int[size1];
for(int i=0;i<list1.length;i++){
	list1[i]=input.nextInt();
}

System.out.print("Enter list2: ");
int size2=input.nextInt();
int[] list2=new int[size2];
for(int i=0;i<list2.length;i++){
	list2[i]=input.nextInt();
}

//Arrays.sort(list1);

int[] list3=merge(list1,list2);
sort(list3);
//Arrays.sort(list3);
for(int i=0;i<list3.length;i++){
	System.out.print(list3[i]+" ");
}

	}

	private static int[] merge(int[] l1, int[] l2) {
		// TODO Auto-generated method stub
		int[] list3=new int[l1.length+l2.length];
		System.arraycopy(l1, 0, list3, 0, l1.length);
		System.arraycopy(l2, 0, list3, l1.length, l2.length);
		return list3;
	}
	
	private static int[] sort(int[] l3){
		
		for(int i=0;i<l3.length-1;i++){
			int minIndex=i;
			int minNum=l3[minIndex];
			for(int j=i+1;j<l3.length;j++){
				if(l3[j]<minNum){
					minIndex=j;
					minNum=l3[minIndex];
				}
			}
			if(minIndex !=i){
				l3[minIndex]=l3[i];
				l3[i]=minNum;
			}
		}
		return l3;
		
	}

}
