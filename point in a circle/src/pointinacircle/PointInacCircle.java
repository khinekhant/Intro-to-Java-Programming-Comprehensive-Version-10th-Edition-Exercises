package pointinacircle;

import java.util.Scanner;

public class PointInacCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=0.0,y1=0.0;
Scanner input=new Scanner(System.in);
System.out.println("enter a point with two coordinates");
double x2=input.nextDouble();
double y2=input.nextDouble();

boolean b= Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2)) <= 10;

if(b){
	System.out.println("Point is in the circle");
}else{
	System.out.println("Point is not in the circle");
}
	}
/*System.out.print("Enter a point with two coordinates: ");
double x = input.nextDouble();
double y = input.nextDouble();

// Compute the distance
double distance = Math.pow(x * x +  y * y, 0.5);

if (distance <= 10)
  System.out.println("Point (" + x + ", " + y + 
    ") is in the circle");
else
  System.out.println("Point (" + x + ", " + y + 
    ") is not in the circle");
}*/
	}


