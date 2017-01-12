package exercise7_34;

import java.util.Arrays;
import java.util.Scanner;import javax.naming.ldap.SortControl;

public class Exercise7_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String string=input.nextLine();
		System.out.println(sort(string));

	}

	private static String sort(String s) {
		// TODO Auto-generated method stub
		char[] cs=new char[s.length()];
		for(int i=0;i<cs.length;i++){
			cs[i]=s.charAt(i);		
		}
		
		for(int i=0;i<cs.length-1;i++){
			char temp;
			for(int j=i+1;j<cs.length;j++){
				if(cs[i]>cs[j]){
					temp=cs[i];
					cs[i]=cs[j];
					cs[j]=temp;
				}
			}
		}
		return new String(cs);
	
	}
	
	

}
