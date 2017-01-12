package exercise5_9;

import java.util.Scanner;

public class Exercise5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String bestStudent="";
		String secondBest="";
		double highestScore=0.0;
		double secondHighest=0.0;
	   
	    System.out.print(
	      "Enter the number of students: ");
	    int numOfStudents = input.nextInt();
	    
	    for(int i=0;i<numOfStudents;i++){

	    System.out.print(
	      "Enter a student name: ");
	    String  stuName= input.next();
	    System.out.print(
	      "Enter a student score: ");
	    double stuScore = input.nextDouble();
	    
	    if(stuScore>highestScore){
	    	bestStudent=stuName;
	    	highestScore=stuScore;
	    }   
	    if(stuScore<highestScore){
	    	secondBest=stuName;
	    	secondHighest=stuScore;
	    }
	   }
	   System.out.println("Highest Score student is "+bestStudent+" with score "+highestScore);
	   System.out.println("Second highest Score student is "+secondBest+" with score "+secondHighest);
	   
	    
	    
	}

}
