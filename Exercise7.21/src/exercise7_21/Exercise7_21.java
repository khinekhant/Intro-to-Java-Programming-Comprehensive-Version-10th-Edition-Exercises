package exercise7_21;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input=new Scanner(System.in);

System.out.print("Enter the number of balls: ");
int numOfBalls=input.nextInt();

System.out.print("Enter number of slots: ");
int numOfSlots=input.nextInt();
input.close();

int[] slot=new int[numOfSlots];
slot=findPath(numOfBalls, numOfSlots,slot);

int max=findMax(slot);

//System.out.println(Arrays.toString(slot));
printVisual(max, slot);
	
}
	
	
	private static int[] findPath(int balls,int slots,int[] array){
		for(int i=0;i<balls;i++){
			String[] path=new String[slots-1];
			for(int j=0;j<slots-1;j++){
				
				int random=(int)(Math.random()*2);
				if(random==0) {
					System.out.print("R");
				    path[j]="R";
				}
				else {
					System.out.print("L");
					 path[j]="L";
				}
				
			}
			System.out.println();
			findSlot(path,array);
		}
		
	return array;
	}

	private static int[] findSlot(String[] p, int[] a) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<p.length;i++){
			if(p[i].equalsIgnoreCase("R")) count++;
		}
		a[count]++;
		return a;
	}
	
	private static int findMax(int[] array){
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
	
	private static void printVisual(int max,int[] array){
		for(int i=0;i<max;i++){
			for(int j=0;j<array.length;j++){
				System.out.print(" | ");
				if(array[j]>=max-i) System.out.print("0");
				else System.out.print(" ");
			}
		System.out.println();
	}
	}

}
