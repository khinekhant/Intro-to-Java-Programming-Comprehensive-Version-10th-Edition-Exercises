package exercise7_12;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("enter 10 numebrs: ");
		
		double[] distinctNum=new double[10];
		double num;
		for(int i=0;i<10;i++){
			num=input.nextDouble();
			distinctNum[i]=num;
		}
		
		System.out.println(Arrays.toString(reverse(distinctNum)));
		
	}

	private static double[] reverse(double[] array) {
		// TODO Auto-generated method stub
		double temp;
		for(int i=0,j=array.length-1;i<=array.length/2;i++,j--){
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		return array;
	}

}
