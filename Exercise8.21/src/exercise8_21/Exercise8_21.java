package exercise8_21;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int numOfCities = input.nextInt();
        
        double[][] coordi=new double[numOfCities][2];
        System.out.print("Enter the coordinates of the city: ");
        for (int i = 0; i < coordi.length; i++){
            for (int j = 0; j < coordi[i].length; j++){
                coordi[i][j] = input.nextDouble();
            }
        }
        
       // int index1=0;int index2=1; 
       // double totalShortestDistance=0;
        double[] dArray=new double[coordi.length];
        for(int row1=0;row1<coordi.length;row1++){
        	double distance=0;
        	for(int row2=0;row2<coordi.length;row2++){
        		if(coordi[row1]!=coordi[row2]){
        			distance+=distance(coordi[row1][0],coordi[row1][1],coordi[row2][0],coordi[row2][1]);
        		}
        	}
        		dArray[row1]=distance;
        	
        }
        System.out.println(Arrays.toString(dArray));
        checkShortest(coordi,dArray);
       
        
	}
	private static double distance(double x1,double y1,double x2,double y2) {
		
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
	}
	
	private static void checkShortest(double[][] coor, double[] dA) {
		// TODO Auto-generated method stub
		int shortestIndex=-1;
		for(int i=0;i<dA.length;i++){
			
			for(int j=0;j<dA.length;j++){
				if(dA[i] != dA[j] && dA[i]<dA[j]){
					shortestIndex=i;
					
				}
			}
			break;
		}
		
		System.out.println("The central city is "+coor[shortestIndex]);
		System.out.println("Total distance to all other cities is "+dA[shortestIndex]);
		
		
	}

	
	

}
