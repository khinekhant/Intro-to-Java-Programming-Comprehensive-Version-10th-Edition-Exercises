package exercise5_37;

import java.util.Scanner;

public class Exercise5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number ");
        int decimal=input.nextInt();
        
        int value=decimal;
        String output="";
       
        while(value!=0){
        	int binary=value%2;
        	value/=2;
        	output=binary+output;
        }
        
 
        System.out.println(output.length()%2 != 0 ? "0"+output:output);
        
        double totalSum = 0;
        for (int i = 1; i < 625; i++) {
        	
            totalSum += 1.0 / (Math.sqrt(i) + Math.sqrt(i + 1.0)); 
            
        }
       
        System.out.println("The total sum: " + totalSum);
	}

}
