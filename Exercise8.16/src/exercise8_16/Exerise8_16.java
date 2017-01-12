package exercise8_16;

import java.util.Scanner;

public class Exerise8_16 {

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
		
		sortArray(points);
		
		printArray(points);
	}

	
	private static double[][] sortArray(double[][] p) {
		// TODO Auto-generated method stub
		for(int row=0;row<p.length;row++){
			for(int row2=0;row2<p.length-1;row2++){
					//
					if(p[row2][0]>p[row2+1][0] || (p[row][0]==p[row2+1][0] && p[row][1]>p[row2+1][1])){
						for(int col=0;col<p[row].length;col++){
					double temp=p[row][col];
					p[row][col]=p[row2+1][col];
					p[row2+1][col]=temp;
				
				}
					}/*else if () {
					double temp=p[row][1];
					p[row][1]=p[row2+1][1];
					p[row2+1][1]=temp;
				}*/
			}
		}
		return p;
	}
	
	
	private static void printArray(double[][] p) {
		// TODO Auto-generated method stub
		for(int row=0;row<p.length;row++){
			for(int col=0;col<p[row].length;col++){
				System.out.print((col+1)%2==0 ? p[row][col]+",":p[row][col]);
			}
			}
		
	}

	
	

}
