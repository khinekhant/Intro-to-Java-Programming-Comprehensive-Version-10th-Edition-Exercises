package exercise7_30;

import java.util.Scanner;

public class Exercise7_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Enter num of values: ");
int size=input.nextInt();

int[] values=new int[size];
System.out.print("Enter values: ");
for(int i=0;i<values.length;i++){
	values[i]=input.nextInt();
}

if (isConsecutiveFour(values))
    System.out.println("The list has consecutive fours");
  else
  	System.out.println("The list has no consecutive fours");
}

	private static boolean isConsecutiveFour(int[] values) {
		// TODO Auto-generated method stub
		for(int i=0;i<values.length-3;i++){
			boolean isE=true;
			for(int j=i;j<i+3;j++){
				if(values[j]!=values[j+1]){
					isE=false;
					break;
				}
			}
			if(isE) return true;
		}
		return false;
	}



}
