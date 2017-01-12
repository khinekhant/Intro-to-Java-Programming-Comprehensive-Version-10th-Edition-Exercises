package exercise8_15;

import java.util.Scanner;

public class Exercise8_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double [][] points=new double[3][2];
Scanner input=new Scanner(System.in);

System.out.println("Enter points: ");
for(int row=0;row<points.length;row++){
	for(int col=0;col<points[row].length;col++){
		points[row][col]=input.nextDouble();
	}
}

if(onSameLine(points)){
	System.out.println("On same line.");
}else{
	System.out.println("Not on same line.");
}
	}

	private static boolean onSameLine(double[][] p) {
		// TODO Auto-generated method stub
		for(int row=0;row<p.length;row++){
			for(int col=0;col<p[row].length-1;col++){
				if(p[row][col]!=p[row][col+1]){
					return false;
				}
			}
		}
		return true;
	}

}
