package exercise5_38;

import java.util.Scanner;

public class Exercise5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number ");
        int decimal=input.nextInt();
        int decimal1=decimal;
        String output="";
       while(decimal1 !=0){
        	int octal=decimal1%8;
        	      decimal1/=8;
        	      output=octal+output;
        }
       
            
        System.out.println(decimal + "'s octal representation is " +output
            );
        String octalString = "";
        int value = decimal;
        while (value != 0) {
          int single = value % 8;
          octalString = single + octalString;
          value = value / 8;
        }
            
        System.out.println(decimal + "'s octal representation is " +
            octalString);
        
	}

}
