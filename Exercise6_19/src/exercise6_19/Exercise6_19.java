package exercise6_19;

import java.awt.geom.Area;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Exercise6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input=new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle");
        double s1=0.0;
        double s2=0.0;
        double s3=0.0;
        
        if(input.hasNextDouble()){
        	 s1=input.nextDouble();
        	 s2=input.nextDouble();
        	 s3=input.nextDouble();
        	
        }else{
        	System.out.println("Enter only number with space after each side");
        }
        
       if( isValid(s1,s2,s3)){
    	   System.out.println(area(s1,s2,s3));
       }else{
    	   System.out.println("Invalid input");
       }
        
        
        
	}

	
	private static boolean isValid(double s1, double s2, double s3) {
		// TODO Auto-generated method stub
		if(s1+s2>s3 || s2+s3>s1 || s1+s3>s2){
		return true;
		}
		return false;
	}
	
	
	private static double area(double s1, double s2, double s3) {
		// TODO Auto-generated method stub
		double s=(s1+s2+s3)/2;
		
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		*/
		
		System.out.println(6.5*(6.5-4)*(6.5-5)*(6.5-4));
	}
	
	

}
