package palidrome;

import java.util.Scanner;

public class Palidrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.println("Enter a string");
String s=input.nextLine();

int index1=0;
int index2=s.length()-1;
boolean isPali;
String output="";
while(index1<index2){
	if(s.charAt(index1) == s.charAt(index2)){
		isPali=true;
	    output="It is a plidrone";
	}
	else {
		isPali=false;
	    output="it is not palidrone";
	}
	
	index1++;
	index2--;
	
}

System.out.println(output);
	}

}
