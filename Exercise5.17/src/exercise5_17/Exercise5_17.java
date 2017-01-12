package exercise5_17;

import java.util.Scanner;

public class Exercise5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines (1-15): ");
        int numberOfLines = input.nextInt();

        while(numberOfLines < 1 || numberOfLines > 15) {
            System.out.println("Invalid input");
            System.out.print("Enter the number of lines (1-15): ");
            numberOfLines = input.nextInt();
        }

            for(int row=1;row<=numberOfLines;row++){
            	for(int spaces=numberOfLines;spaces>=row;spaces--){
            		System.out.printf("%4s"," ");
            	}
            	for(int num=row;num>=1;num--){
            	System.out.printf("%4d",num);
            	}
            	for(int num=2;num<=row;num++){
            		System.out.printf("%4d",num);
            	}
            	System.out.println();
        }
	}

}
