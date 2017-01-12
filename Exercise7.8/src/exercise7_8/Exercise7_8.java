package exercise7_8;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("enter 10 numebrs:");
		int[] distinctNum=new int[10];
		double[] distinctNUm=new double[10];
		
		int num1;
		double num2;
		for(int i=0;i<10;i++){
			if(input.hasNextInt()) {
			num1=input.nextInt();
			distinctNum[i]=num1;
			}
			else {
				num2=input.nextDouble();
				distinctNUm[i]=num2;
		}
	}
		if(distinctNum instanceof int[]){
		int iAverage=average(distinctNum);
		System.out.println(iAverage);
		}
		else{
		double dAverage=average(distinctNUm);
		System.out.println(dAverage);
		}

}

	private static double average(double[] distinctNUm) {
		// TODO Auto-generated method stub
		double total=0.0;
		for(int i=0;i<distinctNUm.length;i++)
			total+=distinctNUm[i];
		double average=total/distinctNUm.length;
		return average;
	}

	private static int average(int[] distinctNum) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=0;i<distinctNum.length;i++)
			total+=distinctNum[i];
		int average=total/distinctNum.length;
		return average;
	}
}