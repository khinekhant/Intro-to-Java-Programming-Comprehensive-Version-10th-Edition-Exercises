package exercise12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Exercise12_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File randomNum=new File("number.txt");
		Random random=new Random();
		PrintWriter pWriter = null;
		try {
			 pWriter=new PrintWriter(randomNum);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<100;i++){
			int num=random.nextInt(100);
			pWriter.print(num+" ");
			
		}
		pWriter.close();
		Scanner scanner=null;
		
		try {
			scanner=new Scanner(randomNum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(scanner.hasNext()){
			int num=scanner.nextInt();
			System.out.println(num);
		}
		
		scanner.close();
		
		
		
		

	}

}
