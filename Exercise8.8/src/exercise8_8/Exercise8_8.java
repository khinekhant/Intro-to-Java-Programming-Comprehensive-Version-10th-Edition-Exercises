package exercise8_8;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of points: ");
		int numOfPoints=input.nextInt();
		
		//getting x1,y1 for each point from user
		double[][] points=new double[numOfPoints][2];
		System.out.print("Enter "+numOfPoints+" points: ");
		for(int i=0;i<points.length;i++){
			points[i][0]=input.nextDouble();
			points[i][1]=input.nextDouble();
		}
		
		int point1=0;
		int point2=1;
		
		double shortestDistance=distance(points[point1][0],points[point1][1],points[point2][0],points[point2][1]);
		int k=0;
		int[][] rowindices=new int[points.length][2];
		for(int row1=0;row1<points.length;row1++){
			for(int row2=row1+1;row2<points.length;row2++){
				double distance=distance(points[row1][0], points[row1][1], points[row2][0], points[row2][1]);
				
				if(distance<shortestDistance){
					rowindices[0][0]=row1;
					rowindices[0][1]=row2;
					shortestDistance=distance;
				}
				else if(distance==shortestDistance){
					rowindices[k][0]=row1;
					rowindices[k][1]=row2;
					k++;
				}
			}
		}
		
		for(int i=0;i<k;i++){
			point1=rowindices[i][0];
			point2=rowindices[i][1];
			System.out.println("The closest two points are "+points[point1][0]+","+points[point1][1]+" and "+points[point2][0]+","+points[point2][1]);
		}
		
		System.out.println("The Distance is "+shortestDistance);
		
		
	}
	
	private static double distance(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}

	

}
