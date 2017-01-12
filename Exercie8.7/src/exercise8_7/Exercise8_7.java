package exercise8_7;

import java.util.Scanner;

public class Exercise8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of points");
		int num=input.nextInt();
		double[][][] points=new double[num][1][3];
		System.out.println("Enter "+num+"points ");
		for(int i=0;i<points.length;i++){
			for(int j=0;j<points[i].length;j++){
				points[i][j][0]=input.nextDouble();
				points[i][j][1]=input.nextDouble();
				points[i][j][2]=input.nextDouble();
			}
		}
		
		
		
		int p1=0;
		int p2=1;
		
		double assumeShortest=computeDamnArray(points[p1][0][0], points[p1][0][1], points[p1][0][2],points[p2][0][0], points[p2][0][1], points[p2][0][2]);
		
		for(int i=0;i<points.length;i++){
			for(int j=i+1;j<points.length;j++){
				double shortest=computeDamnArray(points[i][0][0], points[i][0][1], points[i][0][2], points[j][0][0],points[j][0][1], points[j][0][2]);
				
				if(shortest<=assumeShortest){
					p1=i;
					p2=j;
					assumeShortest=shortest;
				}
			}
			System.out.println("The closet 2 points are "+points[p1][0][0]+","+points[p1][0][1]+","+ points[p1][0][2]+" and "+points[p2][0][0]+","+ points[p2][0][1]+","+ points[p2][0][2]);
			
			
		}
		
		//System.out.println("The closet 2 points are "+points[p1][0][0]+","+points[p1][0][1]+","+ points[p1][0][2]+" and "+points[p2][0][0]+","+ points[p2][0][1]+","+ points[p2][0][2]);
		
		//computeDamnArray();
		
	}

	private static double computeDamnArray(double x1, double y1, double z1, double x2, double y2, double z2) {
		// TODO Auto-generated method stub
		
		return (Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)+Math.pow(z2-z1, 2)));
	}

}
