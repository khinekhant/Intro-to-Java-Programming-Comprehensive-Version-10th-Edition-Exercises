package exercise11_15;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Exerise11_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> arrayList=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of the points: ");
		int numOfPoints = input.nextInt();

	    System.out.print("Enter the coordinates of the points: ");
	    for(int i=0;i<numOfPoints;i++){
	    	int x=input.nextInt();
	    	int y=input.nextInt();
	    	arrayList.add(new Point(x, y));
	    }
	    
	   // System.out.println(arrayList.toString());
	    System.out.println(getArea(arrayList));
	    

	}
	
	public static double getArea(ArrayList<Point> list){ 
		int area=0;
		int sum1=0;
		int sum2=0;
		for(int i=0,j=i+1;i<list.size()-1 && j<list.size();i++,j++){
			sum1+=(list.get(i).x)*(list.get(j).y);
			sum2+=(list.get(i).y)*(list.get(j).x);
		}
		area=(int)(0.5*(sum1-sum2));
		
		return area;
	}

}
