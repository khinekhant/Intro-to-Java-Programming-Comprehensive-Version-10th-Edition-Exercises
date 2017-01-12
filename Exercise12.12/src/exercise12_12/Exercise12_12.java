package exercise12_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_12 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		if(args.length!=1){
			System.out.println("Enter the program name (eg.file.java)");
			throw new IllegalArgumentException();
		}
		
		File srcFile=new File(args[0]);
		if(!srcFile.exists())
		{
			System.out.println("File not exist");
			throw new FileNotFoundException();
		}
		
		Scanner readfile=new Scanner(srcFile);
		StringBuilder buffer=new StringBuilder();
		while(readfile.hasNext())
		{
			String string=readfile.nextLine();
			String string2=string.trim();
			if(string2.length()!=0 && string2.charAt(0)=='{'){
				buffer.append(" {");
				if(string2.length()>1) buffer.append("\r\n"+string.replace('{',' '));
				
			}else buffer.append("\r\n"+string);
		}
		
		readfile.close();
		
		PrintWriter printWriter=new PrintWriter(srcFile);
		printWriter.print(buffer);
		printWriter.close();

	}

}
