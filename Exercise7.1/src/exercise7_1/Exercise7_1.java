package exercise7_1;

import java.util.Scanner;

public class Exercise7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner(System.in);


System.out.println("enter num of students");
int size=input.nextInt();

double[] scores=new double[size];
System.out.println("enter "+size+" scores");
for(int i=0;i<size;i++){
	scores[i]+=input.nextDouble();
}

for(int student=0;student<size;student++){
	System.out.println("Student "+student+"score is "+scores[student]+" and grade is"+getGrades(scores[student]));
}


	}
	
	private static String getGrades(double score) {
		final double BEST=100;
		
			if(score>=BEST-10) return "Greade A";
			else if(score>=BEST-20) return "Grade B";
			else if(score>=BEST-30) return "Grade C";
			else if(score>=BEST-40) return "Grade D";
			else return "Grade F";
	}

}
