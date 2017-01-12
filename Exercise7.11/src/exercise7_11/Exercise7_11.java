package exercise7_11;

import java.util.Scanner;

import javax.print.attribute.standard.MediaName;

public class Exercise7_11 {

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
		
		double mean=mean(distinctNum);
		double devi=deviation(distinctNum,mean);
		System.out.println(mean+"\n"+devi);
		
	}

	private static double mean(double[] distinctNum) {
		// TODO Auto-generated method stub
		double total=0.0;
		double mean;
		for(int i=0;i<distinctNum.length;i++)
			total+=distinctNum[i];
		mean=total/distinctNum.length;
		return mean;
	}

	private static double deviation(double[] distinctNum,double m) {
		// TODO Auto-generated method stub
		double result=0.0;
		double[] resultArray=new double[distinctNum.length];
		for(int i=0;i<distinctNum.length;i++){
			 result=Math.pow(distinctNum[i]-m, 2); 
			resultArray[i]=result;
		}
		double mean=mean(resultArray);
		double devi=Math.sqrt(mean);
		
		return devi;
	}

}
