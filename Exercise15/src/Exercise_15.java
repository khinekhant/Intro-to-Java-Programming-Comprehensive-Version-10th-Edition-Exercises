import java.util.Scanner;

public class Exercise_15 {

	    public static void main(String[] args) {

	    /*	 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a letter: ");
	        char ch = input.next().charAt(0);
	        
	       ch=Character.toUpperCase(ch);
	        int number=0;
	        if(ch>='A' && ch<='O'){
	        	number=2;
	        	int num=ch-'A';
	        	number+=(num/3);
	        }else if(ch>='P' && ch<='S'){
	        	number=7;
	        }else if (ch>='T' && ch<='V') {
				number=8;
			}else if(ch>='W' && ch<='Z') {
				number=9;
			}else{
				System.out.println("Invalid letter");
			}
	        System.out.println("Corresponding number is "+ number);
	       }
	    	*/
	    	//Exercise 16
	    	/*int num= 65+(int)(Math.random()*26);
	    	char letter=(char)num;
	    	System.out.println(letter);
	    	System.out.println(num);
	    	*/
	    	//Exercise 25
	    	
	    	String platenum=""+(char)('A'+Math.random()*26)+(char)(Math.random()*26+'A')+(char)('A'+Math.random()*26)+(int)(Math.random()*10)+
	    			(int)(Math.random()*10)+(int)(Math.random()*10)+(int)(Math.random()*10);
	    	
	    	System.out.println(platenum);
}
}