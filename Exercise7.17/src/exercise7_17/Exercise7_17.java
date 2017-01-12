package exercise7_17;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("enter number of student ");
		int numOfStu=input.nextInt();
	
		String[] stuNames=new String[numOfStu];
		
		//String name;
		for(int i=0;i<stuNames.length;i++){
			System.out.println("enter Names of student "+(i+1));
			stuNames[i]=input.next();
			
		}
		
		double[] stuScores=new double[numOfStu];
		//System.out.print("Enter student's scores");
		//double scores;
		for(int i=0;i<stuScores.length;i++){
			System.out.println("Enter score of "+stuNames[i]);
			stuScores[i]= input.nextDouble();
		    
		}
		
		decreasingOrder(stuScores,stuNames);
		
		
	}

	private static void decreasingOrder(double[] scores,String[] names) {
		// TODO Auto-generated method stub
	
		for(int i=0;i<scores.length-1;i++){
			double currentMax=scores[i];
			String currentName=names[i];
			int currentMaxIndex=i;
			for(int j=i+1;j<scores.length;j++){
				if(scores[j]>currentMax){
					currentName=names[j];
					currentMax=scores[j];
					currentMaxIndex=j;
				}
				
			}
			if(currentMaxIndex!=i){
			names[currentMaxIndex]=names[i];
			names[i]=currentName;
			scores[currentMaxIndex]=scores[i];
			scores[i]=currentMax;
			
			}
			
		}
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));
		
	}
	

}
