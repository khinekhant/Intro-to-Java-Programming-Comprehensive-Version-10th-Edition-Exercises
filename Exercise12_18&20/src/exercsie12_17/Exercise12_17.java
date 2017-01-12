package exercsie12_17;

/*import java.io.*;
import java.util.Scanner;

public class Exercise12_17 {
  public static void main(String[] args) throws Exception {
    // Check command line parameter usage
    if (args.length != 1) {
      System.out.println("Usage: java Exercise12_18 srcRootDirectory");
      System.exit(1);
    }

    // Check if source file exists
    File currentDir = new File(args[0]);

    if (!currentDir.exists()) {
      System.out.println("Current directory " + args[0] + " does not exist");
      System.exit(2);
    }

    if (!currentDir.isDirectory()) {
      System.out.println(args[0] + " is not a directory");
      System.exit(3);
    } 
    else {
      File[] files = currentDir.listFiles();
      for (int i = 0; i < files.length; i++)
        if (files[i].isDirectory() && files[i].getName().startsWith("Exercise")) {
          String packageStatment = "package " + files[i].getName() + ";\r\n";
          insertIntoFilesInDirectory(files[i], packageStatment);
        }
    }
  }

  private static void insertIntoFilesInDirectory(File directory, String line)
      throws Exception {
    File[] files = directory.listFiles();

    for (int i = 0; i < files.length; i++)
      if (files[i].isFile() && files[i].getName().endsWith(".java")) {
        insertPackageStatment(files[i], line);
      }
  }

  private static void insertPackageStatment(File file, String line)
      throws Exception {
    StringBuilder sb = new StringBuilder(line);

    try (
      Scanner input = new Scanner(file);
    ) {
      while (input.hasNext()) 
        sb.append("\r\n" + input.nextLine());
    }

    try (
      // Write back to the file
      PrintWriter output = new PrintWriter(file);
    ) {
      output.printf("%s\r\n", sb.toString());
    }
  }
}*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Note this code has been tested for both exercise 18 and 20, following class number is wrong
public class Exercise12_17 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 if (args.length != 1) {
		      System.out.println(
		        "srcDirectory");
		      System.exit(1);
		    }

		    // Check if source file exists
		    File sourceDir = new File(args[0]);
		    if (!sourceDir.exists()) {
		    	throw new FileNotFoundException();
		    }
		    
		    if(!sourceDir.isDirectory()){
		         throw new IllegalArgumentException("Is not directory, Please Enter directory.");
		    }
		    
		    File[] files=sourceDir.listFiles();
		    for(int i=0;i<files.length;i++){
		    	if(files[i].getName().startsWith("Exercise12.16")){
		    		String deleteStatement="package "+files[i].getName()+";\r\n";
		    		getFilesInPackage(files[i],deleteStatement);
		    	}
		    }
		    

	}
	
	private static void getFilesInPackage(File file, String string) {
		// TODO Auto-generated method stub
		File[] files=file.listFiles();
	
		for(int i=0;i<files.length;i++){
			if(files[i].getName().endsWith(".java")){
				insertIntoFile(files[i], string);
			}
			
		}
		
		
	}

	private static void insertIntoFile(File file,String s) {
		
		StringBuilder builder=new StringBuilder();
		try {
			Scanner reader=new Scanner(file);
			
			
			while(reader.hasNext()){
				String string=reader.nextLine();
				String string2=string.trim();
				if(string2.equals(s.trim())){
					string=string.replaceAll(string2,"");
				    
				}
				
				builder.append("\r\n"+string);
				
			}
			
			/**
			*
			cant put printwriter instantiation sentence just below scanner instantiation line
			*/
			PrintWriter printWriter=new PrintWriter(file);
			printWriter.printf("%s\r\n",builder.toString());
			
			printWriter.close();
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}

}

