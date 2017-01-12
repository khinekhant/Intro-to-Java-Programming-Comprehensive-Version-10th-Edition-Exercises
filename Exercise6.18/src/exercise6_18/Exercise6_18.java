package exercise6_18;

import java.util.Scanner;

public class Exercise6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Enter password: ");
String passw=input.nextLine();

if(checkPassword(passw)) System.out.println("Valid");
else System.out.println("InValid");
	
	}
	

	private static boolean checkPassword(String pw) {
		// TODO Auto-generated method stub
		
		//boolean valid;
		
		if(pw.length()==8){
			int count=0;
			for(int i=0;i<8;i++){
				char ch=pw.charAt(i);
				if(Character.isDigit(ch)|| Character.isLetter(ch)){
					if(Character.isDigit(ch))
						count++;
				}else return false;
	
			}
			
			if(count<2 || count>7) return false;
			else return true;
				
		}else return false;
		
		
		
	}

}
