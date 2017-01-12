import java.util.Scanner;

public class Exercise5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();
        
        int length=s1.length()>s2.length() ? s1.length():s2.length();
        String commomPrefix="";
        for(int i=0;i<=length-1;i++){
        	if(s1.charAt(i)==s2.charAt(i))
        		commomPrefix+=s1.charAt(i);
        	else break;
        }
        System.out.println(commomPrefix);
	}

}
