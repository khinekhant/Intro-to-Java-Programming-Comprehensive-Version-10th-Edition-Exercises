package exercise12_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Exercise12_11 {

	public static void main(String[] args) throws FileNotFoundException, FileAlreadyExistsException {
		// TODO Auto-generated method stub
		if(args.length !=2){
			System.out.println("sourcefile strtoremove");
			System.exit(1);
		}
		
		File srcFile=new File(args[0]);
		if(!srcFile.exists()){
			System.out.println("source file "
					+ args[0]+" does not exist");
			//System.exit(2);
			throw new FileNotFoundException();
		}
		
		/*File targetFile=new File(args[1]);
		if(targetFile.exists()){
			System.out.println("Target File "+args[1]+
					" already exists.");
			throw new FileAlreadyExistsException("File"+targetFile+" already exits");
		}*/
		
		try(
			Scanner input=new Scanner(srcFile);
			PrintWriter output=new PrintWriter(srcFile);
		){
			String s1="";
			while(input.hasNext()){
				 s1+=input.nextLine();
			}
			s1=s1.replaceAll(args[1],"");
			output.write(s1);
			
		}
		
		
	

	}
	

}
