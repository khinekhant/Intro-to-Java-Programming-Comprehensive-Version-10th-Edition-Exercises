import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first city: ");
	    String s1 = input.nextLine();    
	    System.out.print("Enter the second city: ");
	    String s2 = input.nextLine(); 
	    System.out.print("Enter the third city: ");
	    String s3 = input.nextLine(); 
	    String temp;
	    if(s1.compareTo(s2)>0){
	    	temp=s2;
	    	s2=s1;
	    	s1=temp;
	    }
	    if(s1.compareTo(s3)>0){
	    	temp=s3;
	    	s3=s1;
	    	s1=temp;
	    }
	    if(s2.compareTo(s3)>0){
	    	temp=s3;
	    	s3=s2;
	    	s2=temp;
	    }
	    
	    System.out.println("3 CITIES In acsending order are"+s1+" "+s2+" "+s3);
	}

}
